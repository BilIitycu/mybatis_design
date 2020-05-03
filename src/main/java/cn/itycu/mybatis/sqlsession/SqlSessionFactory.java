package cn.itycu.mybatis.sqlsession;

/**
 * @author 披风少年
 * @version 1.0
 * @date 2020/5/3 18:19
 */
public interface SqlSessionFactory {

    /**
     * 用于打开一个新的类
     */
    public SqlSession openSession();
}
