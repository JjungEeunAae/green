package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.time.Duration;
import java.time.LocalTime;

@Aspect
public class TimeAspect {


    /*@Pointcut("execution( public * org..*(..))")
    private void publicTarget() { }*/

    @Pointcut("execution(* org.example.components..*(..))")
    private void publicTarget() { }


    @Around("publicTarget()")
    // 새로은 오브젝트를 만들 수 있게 함
    public Object measure(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LocalTime beforeTime = LocalTime.now();
        try {
            System.out.println("Aspect 실행");
            Object result = proceedingJoinPoint.proceed();
            return result;
        } finally {
            LocalTime afterTime = LocalTime.now();
            Duration duration = Duration.between(beforeTime, afterTime);
            System.out.println(duration.getNano());
            System.out.println("끝나기 전에 실행되는 부분");
        }
    }
}
