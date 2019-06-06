package cn.hanyingming.blog.service.impl;

import cn.hanyingming.blog.dto.base.BaseResult;
import cn.hanyingming.blog.entity.BdBosToken;
import cn.hanyingming.blog.service.GrantService;
import com.baidubce.BceClientConfiguration;
import com.baidubce.services.sts.StsClient;
import com.baidubce.services.sts.model.GetSessionTokenRequest;
import com.baidubce.services.sts.model.GetSessionTokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrantServiceImpl implements GrantService {

    @Autowired
    private BceClientConfiguration bceClientConfiguration;

    @Override
    public BaseResult<BdBosToken> getBdBosToken() {
        StsClient client = new StsClient(bceClientConfiguration);
        GetSessionTokenResponse response =client.getSessionToken(new GetSessionTokenRequest());
        BdBosToken bdBosToken = new BdBosToken(response.getAccessKeyId(),response.getSecretAccessKey(),response.getSessionToken(), response.getExpiration().toString());
        BaseResult<BdBosToken> baseResult = new BaseResult<>();
        baseResult.setCode(200);
        baseResult.setData(bdBosToken);
        baseResult.setMessage(null);
        return baseResult;
    }
}
