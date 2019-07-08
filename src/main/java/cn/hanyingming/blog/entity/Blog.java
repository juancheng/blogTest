package cn.hanyingming.blog.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Blog implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * avatar
     */
    private String avatar;

    /**
     * title
     */
    private String title;

    /**
     * summary
     */
    private String summary;

    /**
     * mdContent
     */
    private String mdContent;

    /**
     * htmlContent
     */
    private String htmlContent;

    /**
     * readnum
     */
    private Integer readnum;

    private static final long serialVersionUID = 1L;
}