package cn.hanyingming.blog.service;

import cn.hanyingming.blog.dto.base.BaseResult;
import cn.hanyingming.blog.entity.BdBosToken;

/**
 * 授权服务业务逻辑处理接口
 */
public interface GrantService {
    BaseResult<BdBosToken> getBdBosToken();
}
