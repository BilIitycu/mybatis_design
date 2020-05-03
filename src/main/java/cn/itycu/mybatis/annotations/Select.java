package cn.itycu.mybatis.annotations;

/**
 * @author 披风少年
 * @version 1.0
 * @date 2020/5/3 19:55
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Select {

    /**
     * 配置sql语句
     * @return
     */
    String value();
}
