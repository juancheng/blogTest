package cn.hanyingming.blog.mapper;

import cn.hanyingming.blog.entity.ImgBanner;import java.util.List;

public interface ImgBannerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImgBanner record);

    int insertSelective(ImgBanner record);

    ImgBanner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImgBanner record);

    int updateByPrimaryKey(ImgBanner record);

    List<ImgBanner> findByPage(String type);
}