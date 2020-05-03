package cn.itycu.mybatis.sqlsession.defaults;

import cn.itycu.mybatis.cfg.Configuration;
import cn.itycu.mybatis.sqlsession.SqlSession;
import cn.itycu.mybatis.sqlsession.SqlSessionFactory;

/**
 * @author 披风少年
 * @version 1.0
 * @date 2020/5/3 18:52
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg) {
        this.cfg = cfg;
    }
    /**
     * 用于创建新的操作数据库对象
     * @return
     */
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
