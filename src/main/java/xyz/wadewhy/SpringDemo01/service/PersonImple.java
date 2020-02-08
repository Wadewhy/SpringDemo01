/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.SpringDemo01.service 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年2月8日 下午9:53:28 
 */
package xyz.wadewhy.SpringDemo01.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * bean注入
 * 1、@Component("id")
 * 2、WEB:
 *             @Controller("id")    web
 *             @Service("id")        service
 *            @Repository("id")    dao
 */
@Component("person")
/*
 * bean作用域
 * 
 * @Scope("singleton") 单例（也是默认）
 * 
 * @Scope("prototype") 每new一次都是新的对象
 */
@Scope("prototype")
public class PersonImple implements Person {
    /*
     * bean参数注入 1、普通参数（也就是说那些基本数据类型） 在参数上面或者在相应的set方法 @Value("值") 2、引用参数
     * 2.1按照类型注入：@Autowired 2.2按照名称注入：@Autowired @Qualifier("id")
     * 2.3按照名称注入：@Resource
     * 
     */
    // @Resource
    private Dao_TestImpl dao_test;
    @Value("wadewhy")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dao_TestImpl getDao_test() {
        return dao_test;
    }

    @Resource
    public void setDao_test(Dao_TestImpl dao_test) {
        this.dao_test = dao_test;
    }

    /*
     * bean初始化方法注解
     * 
     * @PostConstruct
     */
    @PostConstruct
    public void init() {
        System.out.println("init()>>>>>>");
    }

    /*
     * bean销毁注解
     * 
     * @PreDestroy
     */
    @PreDestroy
    public void destroy() {
        System.out.println("destroy()>>>>>");
    }

}