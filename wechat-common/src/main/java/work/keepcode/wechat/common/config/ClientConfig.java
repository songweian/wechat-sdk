package work.keepcode.wechat.common.config;

import lombok.Data;

@Data
public class ClientConfig {
    private String endpoint;
    private String appId;
    private String appSecret;
    private String grantType;
}
