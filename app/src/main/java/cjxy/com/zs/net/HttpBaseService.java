package cjxy.com.zs.net;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by yuan-pc on 2016/06/22.
 */
public class HttpBaseService {

    private void request(Call call, RequsetCall<Object> requsetCallcall, final Class<?> tClass) {

    }

    public interface RequsetCall<T> {
        /**
         * 链接成功
         */
        public void onGood(T result);

        /**
         * 连接失败
         */
        public void onFailure(String msg);
    }
}
