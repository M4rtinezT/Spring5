package spring5Demo3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author TJ
 * @create 2021-0915 16:05
 */



@Configuration
@ComponentScan(basePackages = {"spring5Demo3"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
