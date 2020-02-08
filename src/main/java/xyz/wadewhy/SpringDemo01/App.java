package xyz.wadewhy.SpringDemo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *
 * @ClassName: App 
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月3日 下午9:49:06
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
