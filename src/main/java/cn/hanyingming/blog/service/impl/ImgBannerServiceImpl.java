package cn.hanyingming.blog.service.impl;

import cn.hanyingming.blog.dto.base.BaseResult;
import cn.hanyingming.blog.entity.Blog;
import cn.hanyingming.blog.entity.ImgBanner;
import cn.hanyingming.blog.mapper.ImgBannerMapper;
import cn.hanyingming.blog.service.ImgBannerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgBannerServiceImpl implements ImgBannerService {

    private static final Logger logger = LoggerFactory.getLogger(ImgBannerServiceImpl.class);

    @Autowired
    private ImgBannerMapper imgBannerMapper;

    @Override
    public BaseResult<List<ImgBanner>> getBannerByType(String type) {
        List<ImgBanner> imgBannerList = imgBannerMapper.findByPage(type);
        BaseResult<List<ImgBanner>> baseResult = new BaseResult<>();
        baseResult.setCode(200);
        baseResult.setData(imgBannerList);
        baseResult.setMessage(null);
        return baseResult;
    }
}
