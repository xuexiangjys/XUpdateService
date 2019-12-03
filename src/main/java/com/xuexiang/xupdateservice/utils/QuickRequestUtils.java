package com.xuexiang.xupdateservice.utils;

import com.xuexiang.xupdateservice.component.annotation.LimitedRequest;
import com.xuexiang.xupdateservice.component.annotation.QuickRequest;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 快速请求工具类
 *
 * @author xuexiang
 * @since 2018/8/7 下午2:27
 */
public final class QuickRequestUtils {

    private QuickRequestUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }
    /**
     * 存放请求的次数
     */
    private static Map<String, Integer> sRequestCount = new ConcurrentHashMap<>();

    /**
     * 存放请求的时间戳
     */
    private static Map<String, Long> sRequestTimeStamp = new ConcurrentHashMap<>();

    /**
     * 是否是快速请求
     *
     * @param key
     * @param quickRequest
     * @param requestTimeStamp 请求携带的时间戳
     * @return
     */
    public static boolean isQuickRequest(String key, QuickRequest quickRequest, String requestTimeStamp) {
        long now = Long.valueOf(requestTimeStamp);
        long lastRequestTimeStamp = sRequestTimeStamp.getOrDefault(key, 0L); //获取最后一次请求的时间戳
        long timeD = now - lastRequestTimeStamp; //计算出间隔
        if (0 < timeD && timeD < quickRequest.interval()) {
            return true;
        } else {
            sRequestTimeStamp.put(key, now);
            return false;
        }
    }


    /**
     * 是否是快速请求
     *
     * @param key
     * @param limit
     * @return
     */
    public static boolean isQuickRequest(String key, LimitedRequest limit) {
        int count = sRequestCount.getOrDefault(key, 0) + 1;
        sRequestCount.put(key, count);

        if (count > 0) {
            Timer timer = new Timer();
            TimerTask task = new TimerTask() { //创建一个新的计时器任务。
                @Override
                public void run() {
                    int number = sRequestCount.getOrDefault(key, 0) - 1;
                    if (number > 0) {
                        sRequestCount.put(key, number);
                    } else {
                        sRequestCount.remove(key);
                    }
                }
            };
            timer.schedule(task, limit.interval());  //安排在指定延迟后执行指定的任务。task : 所要安排的任务。: 执行任务前的延迟时间，单位是毫秒。
        }
        return count > limit.count();
    }


}
