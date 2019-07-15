package cn.hanyingming.blog.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ImgBanner implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * type
     */
    private String type;

    /**
     * title
     */
    private String title;

    /**
     * subTitle
     */
    private String subTitle;

    /**
     * status
     */
    private String status;

    /**
     * imgUrl
     */
    private String imgUrl;

    private String goUrl;

    private static final long serialVersionUID = 1L;
}