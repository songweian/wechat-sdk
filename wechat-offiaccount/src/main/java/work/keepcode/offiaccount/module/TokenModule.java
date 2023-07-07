package work.keepcode.offiaccount.module;

import lombok.extern.slf4j.Slf4j;
import work.keepcode.offiaccount.http.AccessTokenResponse;
import work.keepcode.wechat.common.config.ClientConfig;
import work.keepcode.wechat.http.WechatHttpClient;

/**
 * 获取 Access token
 * <a href="https://developers.weixin.qq.com/doc/offiaccount/Basic_Information/Get_access_token.html"></a>
 */
@Slf4j
public class TokenModule {

    private final WechatHttpClient wechatHttpClient;
    private final ClientConfig clientConfig;

    public TokenModule(ClientConfig clientConfig, WechatHttpClient wechatHttpClient) {
        this.clientConfig = clientConfig;
        this.wechatHttpClient = wechatHttpClient;
    }

    public AccessTokenResponse getAccessToken() {
        String appId = clientConfig.getAppId();
        String appSecret = clientConfig.getAppSecret();
        String grantType = clientConfig.getGrantType();

        AccessTokenResponse response = wechatHttpClient.get(
                clientConfig.getEndpoint() + "/cgi-bin/token?grant_type=" + grantType + "&appid=" + appId + "&secret=" + appSecret,
                AccessTokenResponse.class);
        if (response.isFailed()) {
            log.error("获取 access token 失败: {}", response.getError());
            return null;
        }
        return response;
    }

}
