package cn.hanyingming.blog.config.bdBosConfig;

import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.BceCredentials;
import com.baidubce.auth.DefaultBceCredentials;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BdBosConfig {
    @Value("${baidu.accss_key_id}")
    private String bdBosAccessKeyId;

    @Value("${baidu.access_key}")
    private String bdBosAccessKey;

    @Value("${baidu.endpoint}")
    private String bdBosEndpoint;

    @Bean(name="bceClientConfiguration")
    public BceClientConfiguration createBdBosClientConfig() {
        BceCredentials credentials = new DefaultBceCredentials(bdBosAccessKeyId, bdBosAccessKey);
        return new BceClientConfiguration().withEndpoint(bdBosEndpoint).withCredentials(credentials);
    }
}
