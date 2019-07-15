package cn.hanyingming.blog.web;

import cn.hanyingming.blog.dto.base.BaseResult;
import cn.hanyingming.blog.entity.ImgBanner;
import cn.hanyingming.blog.service.ImgBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/imgBanner")
public class ImgBannerController {

    @Autowired
    ImgBannerService imgBannerService;

    @GetMapping("/getImgBannersByType")
    BaseResult<List<ImgBanner>> getImgBannersByType(@RequestParam(value = "type") String type) {
        return imgBannerService.getBannerByType(type);
    }
}
