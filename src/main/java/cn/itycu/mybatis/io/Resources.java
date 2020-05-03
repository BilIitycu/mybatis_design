package cn.itycu.mybatis.io;

import java.io.InputStream;

/**
 * @author 披风少年
 * @version 1.0
 * @date 2020/5/3 18:11
 * 使用类加载器读取配置文件的类
 */
public class Resources {

    /**
     * 根据传入参数，获取字节输入流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath) {
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
