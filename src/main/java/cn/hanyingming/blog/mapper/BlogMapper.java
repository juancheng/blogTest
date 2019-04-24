package cn.hanyingming.blog.mapper;
import java.util.List;
import cn.hanyingming.blog.entity.Blog;import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    int deleteByPrimaryKey(String id);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);

    List<Blog> findByPage();

    int saveBlog(Blog record);
}