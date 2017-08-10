package com.example.administrator.downloaddemo.downloadutils.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Jim on 2017/7/24.
 */

public class ThreadPoolsUtil {

    private static ThreadPoolsUtil sThreadPoolsUtil;
    private ExecutorService fixedThreadPool;
    private ExecutorService cachedThreadPool;

    private ThreadPoolsUtil() {
        fixedThreadPool = Executors.newFixedThreadPool(5);
        cachedThreadPool = Executors.newCachedThreadPool();
    }

    public static ThreadPoolsUtil getInstance() {
        if (sThreadPoolsUtil == null) {
            synchronized (ThreadPoolsUtil.class) {
                if (sThreadPoolsUtil == null) {
                    sThreadPoolsUtil = new ThreadPoolsUtil();
                }
            }
        }
        return sThreadPoolsUtil;
    }

    public ExecutorService getFixedThreadPool() {
        return fixedThreadPool;
    }

    public ExecutorService getCachedThreadPool() {
        return cachedThreadPool;
    }


}
