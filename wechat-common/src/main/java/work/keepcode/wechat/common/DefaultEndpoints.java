package work.keepcode.wechat.common;

/**
 * 接口域名说明
 * <a href="https://developers.weixin.qq.com/doc/offiaccount/Basic_Information/Interface_field_description.html"/></a>
 * 通用域名(api.weixin.qq.com)，使用该域名将访问官方指定就近的接入点；
 * 通用异地容灾域名(api2.weixin.qq.com)，当上述域名不可访问时可改访问此域名；
 * 上海域名(sh.api.weixin.qq.com)，使用该域名将访问上海的接入点；
 * 深圳域名(sz.api.weixin.qq.com)，使用该域名将访问深圳的接入点；
 * 香港域名(hk.api.weixin.qq.com)，使用该域名将访问香港的接入点。
 */
public class DefaultEndpoints {
    public static String DEFAULT_ENDPOINT = "https://api.weixin.qq.com/";
    public static String DEFAULT_ENDPOINT2 = "https://api2.weixin.qq.com/";
    public static String SH_ENDPOINT = "https://sh.api.weixin.qq.com/";
    public static String SZ_ENDPOINT = "https://sz.api.weixin.qq.com/";
    public static String HK_ENDPOINT = "https://hk.api.weixin.qq.com/";

}
