package xyz.wadewhy.SpringDemo01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xyz.wadewhy.SpringDemo01.pojo.Bus;
import xyz.wadewhy.SpringDemo01.pojo.Car;
import xyz.wadewhy.SpringDemo01.pojo.Car2;
import xyz.wadewhy.SpringDemo01.pojo.Persons;
import xyz.wadewhy.SpringDemo01.pojo.User;
import xyz.wadewhy.SpringDemo01.service.Dao_TestImpl;
import xyz.wadewhy.SpringDemo01.service.Person;
import xyz.wadewhy.SpringDemo01.service.PersonImple;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void fun1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Persons person1 = (Persons) ctx.getBean("persons");
        Persons person2 = (Persons) ctx.getBean("persons");
        System.out.println(person1 == person2);
    }

    /**
     * 构造注入-----按类型匹配入参方式
     */
    @Test
    public void fun2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) context.getBean("Car");
        System.out.println("构造注入-----按类型匹配入参方式Car:" + car.toString());
    }

    /**
     * 构造注入-----按索引匹配入参方式
     */
    @Test
    public void fun3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) context.getBean("Car2");
        System.out.println("构造注入-----按索引匹配入参方式Car2:" + car.toString());
    }

    /**
     * 构造注入-----按匹配类型和索引匹配入参方式
     */
    @Test
    public void fun4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car2 car = (Car2) context.getBean("Car3");
        System.out.println("构造注入-----按匹配类型和索引匹配入参方式Car3:" + car.toString());
    }

    /**
     * 构造注入-----按自身类型反射入参方式
     */
    @Test
    public void fun5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("User");
        System.out.println("构造注入-----按自身类型反射入参方式User:" + user.toString());
    }

    /**
     * 屬性注入----
     */
    @Test
    public void fun6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bus bus = (Bus) context.getBean("Bus");
        System.out.println("屬性注入Bus:" + bus.toString());
    }

    /**
     * 静态工厂注入----
     */
    @Test
    public void fun7() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) context.getBean("Car4");
        Car2 car2 = (Car2) context.getBean("Car5");
        System.out.println("静态工厂注入----" + car.toString());
        System.out.println("静态工厂注入----" + car2.toString());
    }

    /**
     * 非静态工厂注入----
     */
    @Test
    public void fun8() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car2 car = (Car2) context.getBean("Car6");
        System.out.println("非静态工厂注入----" + car.toString());
    }

    /**
     * 注解注入
     */
    @Test
    public void fun9() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = ac.getBean("person", Person.class);
        System.out.println(person);
        PersonImple pi = (PersonImple) person;
        System.out.println(pi.getName());
        Dao_TestImpl dao_TestImpl = pi.getDao_test();
        System.out.println(dao_TestImpl);
        dao_TestImpl.add();
        System.out.println(dao_TestImpl.getName());

    }
}
