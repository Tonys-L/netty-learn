package com.lt;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 功能：
 *
 * @author ：LT(286269159@qq.com)
 * @version ：2018 Version：1.0
 * @create ：2018-06-08 14:59:45
 */
public class TimeServerHandlerExecutorPool {
	private ThreadFactory namedThreadFactory = Executors.defaultThreadFactory();
	private ExecutorService executorService = new ThreadPoolExecutor(4, 8,
			0L, TimeUnit.MILLISECONDS,
			new ArrayBlockingQueue<>(16), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

	public TimeServerHandlerExecutorPool() {
	}

	public void execute(Runnable task) {
		executorService.execute(task);
	}
}
