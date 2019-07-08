package cn.hanyingming.blog.web;

import cn.hanyingming.blog.dto.base.BaseResult;
import cn.hanyingming.blog.entity.Blog;
import cn.hanyingming.blog.service.BlogService;
import cn.hanyingming.blog.service.impl.BlogServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {

    private static final Logger logger = LoggerFactory.getLogger(BlogServiceImpl.class);

    @Autowired
    private BlogService blogService;

    @GetMapping("/list")
    public BaseResult listBlog(@RequestParam(value = "page") Integer page, @RequestParam(value = "pageSize") Integer pageSize) {
        return blogService.listBlog(page, pageSize);
    }

    @PostMapping("/save")
    public BaseResult saveBlog(@RequestBody Blog blog) {
        return blogService.saveBlog(blog);
    }

    @GetMapping("/getBlogById")
    public BaseResult getBlogById(@RequestParam(value = "id") Integer id) {
        return blogService.getBlogById(id);
    }
}
