package cn.hanyingming.blog.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Blog implements Serializable {
    private String id;

    private String title;

    private String summary;

    private String content;

    private Integer readnum;

    private String avatar;

    private static final long serialVersionUID = 1L;
}