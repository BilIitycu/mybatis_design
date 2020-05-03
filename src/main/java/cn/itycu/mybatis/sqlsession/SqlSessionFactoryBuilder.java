package cn.itycu.mybatis.sqlsession;

import cn.itycu.mybatis.cfg.Configuration;
import cn.itycu.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import cn.itycu.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @author 披风少年
 * @version 1.0
 * @date 2020/5/3 18:17
 * 用于创建一个SQL Session Factory对象
 */
public class SqlSessionFactoryBuilder {

    /**
     * 根据参数的字节输入流构建SQL Session Factory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }
}
