package cn.itycu;

import cn.itycu.dao.IUserDao;
import cn.itycu.domain.User;
import cn.itycu.mybatis.io.Resources;
import cn.itycu.mybatis.sqlsession.SqlSession;
import cn.itycu.mybatis.sqlsession.SqlSessionFactory;
import cn.itycu.mybatis.sqlsession.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 披风少年
 * @version 1.0
 * @date 2020/5/3 15:29
 */
public class MybatisTest {

    /**
     * 入门案例
     * @param args
     */
    public static void main(String[] args) throws IOException {
        /**
         * 1、读取配置文件
         * 2、创建SQL session factory工厂
         * 3、使用工厂生产SQL session对象
         * 4、使用SQL session创建Dao代理对象
         * 5、使用代理对象执行方法
         * 6、释放资源
         */
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();

    }
}
