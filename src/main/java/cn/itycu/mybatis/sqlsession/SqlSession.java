package cn.itycu.mybatis.sqlsession;

/**
 * @author 披风少年
 * @version 1.0
 * @date 2020/5/3 18:21
 * 自定义Mybatis中和数据库交互的核心类
 * 可以创建dao接口的代理对象
 */
public interface SqlSession {

    /**
     * 根据参数创建一个代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();
}
