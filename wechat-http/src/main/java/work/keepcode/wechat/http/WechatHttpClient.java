package work.keepcode.wechat.http;

public interface WechatHttpClient {

    <T> T get(String url, Class<T> clazz);

    <T> T post(String url, Object data, Class<T> clazz);
}