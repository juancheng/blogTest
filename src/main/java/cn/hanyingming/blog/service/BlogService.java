package cn.hanyingming.blog.service;

import cn.hanyingming.blog.dto.base.BaseResult;
import cn.hanyingming.blog.entity.Blog;
import com.github.pagehelper.PageInfo;

public interface BlogService {
    BaseResult<PageInfo<Blog>> listBlog(int page, int pageSize);

    BaseResult<Blog> saveBlog(Blog blog);

    BaseResult<Blog> getBlogById(Integer id);
}
