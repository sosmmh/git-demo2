package com.zhss;

import com.zhss.service.IndexServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: lixiahan
 * @create: 2019/09/19 17:56
 */
public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(Application.class);


        IndexServiceImpl service = context.getBean(IndexServiceImpl.class);
        service.query();

    }
}
