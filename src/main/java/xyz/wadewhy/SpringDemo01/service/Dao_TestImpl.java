/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.SpringDemo01.service 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年2月8日 下午9:52:48 
 */
package xyz.wadewhy.SpringDemo01.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年2月8日 下午9:52:48
* 类说明
*/
/**
 * @ClassName: Dao_TestImpl
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月8日 下午9:52:48
 */
@Component("dao_demo")
public class Dao_TestImpl {

    private String name;

    public String getName() {
        return name;
    }

    @Value("demo")
    public void setName(String name) {
        this.name = name;
    }

    public void add() {
        System.out.println("add>>>>>>");
    }
}
