package com.zhss.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: Lixh
 *
 */
@Component
@Aspect
public class LogAop {

    @Pointcut(value = "execution(* com.zhss.service.*.*query(..))")
    public void pointCut() {}

    @Pointcut(value = "within(com.zhss.service.*)")
    public void pointCutWithin() {}

    @Pointcut(value = "@annotation(com.zhss.anno.Entity)")
    public void pointCutAnnotation() {}

    @Before("pointCutAnnotation()")
    public void before() {
        System.out.println("before");
    }
}
