package cn.hanyingming.blog.service;

import cn.hanyingming.blog.dto.base.BaseResult;
import cn.hanyingming.blog.entity.ImgBanner;

import java.util.List;

public interface ImgBannerService {
    /**
     * 根据类型获取 banner 列表
     * @param type
     * @return
     */
    BaseResult<List<ImgBanner>> getBannerByType(String type);
}
