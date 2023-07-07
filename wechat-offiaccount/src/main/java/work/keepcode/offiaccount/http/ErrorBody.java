package work.keepcode.offiaccount.http;

import lombok.Data;

/**
 * {"errcode":40013,"errmsg":"invalid appid"}
 */
@Data
public class ErrorBody {
    private int errcode;
    private String errmsg;
}
