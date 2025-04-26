package com.sky.context;

/**
 * BaseContext 类用于管理当前线程的上下文信息，特别是当前线程的ID。
 * 该类使用 ThreadLocal 来确保每个线程的ID是独立的，并且可以在线程之间安全地共享。
 */
public class BaseContext {

    /**
     * ThreadLocal 实例，用于存储当前线程的ID。
     */
    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置当前线程的ID。
     *
     * @param id 要设置的线程ID，类型为 Long。
     */
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    /**
     * 获取当前线程的ID。
     *
     * @return 当前线程的ID，类型为 Long。如果未设置，则返回 null。
     */
    public static Long getCurrentId() {
        return threadLocal.get();
    }

    /**
     * 移除当前线程的ID。
     * 该方法通常在线程结束时调用，以清理线程的上下文信息。
     */
    public static void removeCurrentId() {
        threadLocal.remove();
    }

}
