package spring5Demo3.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author TJ
 * @create 2021-0915 14:14
 */

//增强的类
@Component
@Aspect
public class UserProxy {

    //相同切入点抽取
    @Pointcut (value = "execution(* spring5Demo3.AOP.User.add())")
    public void pointDemo(){
    }
    //前置通知
    @Before(value = "pointDemo()")
    public void before1(){
        System.out.println("before cut.....");
    }


    //前置通知
    @Before(value = "execution(* spring5Demo3.AOP.User.add())")
    public void before(){
        System.out.println("before.....");
    }

    //后置通知
    @AfterReturning(value = "execution(* spring5Demo3.AOP.User.add())")
    public void afterReturning(){
        System.out.println("afterReturning.....");
    }

    //异常通知
    @AfterThrowing(value = "execution(* spring5Demo3.AOP.User.add())")
    public void afterThrowing(){
        System.out.println("afterThrowing.....");
    }

    //环绕通知
    @Around(value = "execution(* spring5Demo3.AOP.User.add())")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("around before.....");
        proceedingJoinPoint.proceed();
        System.out.println("around after.....");
    }

    //最终通知
    @After(value = "execution(* spring5Demo3.AOP.User.add())")
    public void after(){
        System.out.println("after.....");
    }
}
