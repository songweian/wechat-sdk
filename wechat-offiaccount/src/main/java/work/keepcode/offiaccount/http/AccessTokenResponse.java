package work.keepcode.offiaccount.http;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import work.keepcode.wechat.http.HttpResponse;

public class AccessTokenResponse extends HttpResponse<AccessTokenResponse.AccessToken, ErrorBody> {

    @Override
    protected boolean isSuccess() {
        return false;
    }

    @Data
    public static class AccessToken {
        /**
         * 获取到的凭证
         */
        @SerializedName("access_token")
        private String accessToken;
        /**
         * 凭证有效时间，单位：秒
         */
        @SerializedName("expires_in")
        private int expiresIn;
    }

}
