package cn.hanyingming.blog.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 百度授权token实体类
 */
@Getter
@Setter
@ToString
public class BdBosToken {

    public BdBosToken() {
    }

    public BdBosToken(String accessKeyId, String secretAccessKey, String sessionToken, String expiration) {
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
        this.sessionToken = sessionToken;
        this.expiration = expiration;
    }

    private String accessKeyId;
    private String secretAccessKey;
    private String sessionToken;
    private String expiration;
}
