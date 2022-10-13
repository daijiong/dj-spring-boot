package com.gupaoedu.course.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class GpDefineImportSelector implements ImportSelector {
    /**
     * 动态装载bean，方法返回需要动态装载的Configuration集合或者Bean集合，也就是告诉Spring需要装配的bean
     * 所以要实现自动装配，只要在这里去加载所有的配置类就行？
     * 加载方式可以是通过某种机制去完成指定路径（package.class.classname）的配置类的扫描就行？
     * @param importingClassMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 返回动态装载的Bean集合
        //        return new String[] { GpSqlSessionFactory.class.getName(), RedisConfiguration.class.getName() };
        // 返回动态装载的Configuration集合
        return new String[] { MybatisConfiguration.class.getName(), RedisConfiguration.class.getName() };
    }
}
