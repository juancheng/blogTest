package cn.hanyingming.blog.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class Blog {
    /**
     *
     */
    private String id;

    /**
     *
     */
    @NotBlank(message = "文章标题不能为空")
    @Size(max = 10, message = "标题长度最多10个字符")
    private String title;

    /**
     *
     */
    @NotBlank(message = "文章摘要不能为空")
    @Size(max = 30, message = "摘要文字个数最多30个字符")
    private String summary;

    /**
     *
     */
    @NotBlank(message = "文章内容不能为空")
    private String content;

    /**
     *
     */
    private Integer readnum;
}