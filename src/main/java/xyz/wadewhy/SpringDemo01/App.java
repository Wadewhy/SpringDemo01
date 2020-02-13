package xyz.wadewhy.SpringDemo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import xyz.wadewhy.SpringDemo01.config.AppConf;
import xyz.wadewhy.SpringDemo01.config.LoginService;

/*
 *
 * @ClassName: App 
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月3日 下午9:49:06
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConf.class);
        LoginService loginservice = ac.getBean(LoginService.class);
        System.out.println(loginservice.toString());
    }
}
