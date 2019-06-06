package cn.hanyingming.blog.web;

import cn.hanyingming.blog.dto.base.BaseResult;
import cn.hanyingming.blog.entity.BdBosToken;
import cn.hanyingming.blog.service.GrantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grant")
public class GrantController {

    @Autowired
    GrantService grantService;

    @GetMapping("/getBdBosToken")
    BaseResult<BdBosToken> getBdBosToken() {
        return grantService.getBdBosToken();
    }
}
