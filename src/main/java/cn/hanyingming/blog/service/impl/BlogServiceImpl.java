package cn.hanyingming.blog.service.impl;

import cn.hanyingming.blog.dto.base.BaseResult;
import cn.hanyingming.blog.entity.Blog;
import cn.hanyingming.blog.mapper.BlogMapper;
import cn.hanyingming.blog.service.BlogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    private static final Logger logger = LoggerFactory.getLogger(BlogServiceImpl.class);

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public BaseResult<PageInfo<Blog>> listBlog(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        PageInfo pageInfo = new PageInfo<>(blogMapper.findByPage());
        BaseResult<PageInfo<Blog>> baseResult = new BaseResult<>();
        baseResult.setCode(200);
        baseResult.setData(pageInfo);
        baseResult.setMessage(null);
        return baseResult;
    }

    @Override
    public BaseResult<Blog> saveBlog(Blog blog) {
        int effectRows = blogMapper.insertSelective(blog);
        BaseResult<Blog> baseResult = new BaseResult<>();
        baseResult.setCode(200);
        baseResult.setData(blog);
        baseResult.setMessage(null);
        return baseResult;
    }

    @Override
    public BaseResult<Blog> getBlogById(Integer id) {
        Blog blog = blogMapper.selectByPrimaryKey(id);
        BaseResult<Blog> baseResult = new BaseResult<>();
        baseResult.setCode(200);
        baseResult.setData(blog);
        baseResult.setMessage(null);
        return baseResult;
    }

}
