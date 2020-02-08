/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.SpringDemo01.pojo 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年2月8日 下午8:25:48 
 */
package xyz.wadewhy.SpringDemo01.pojo;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年2月8日 下午8:25:48
* 类说明
*/
/**
 * @ClassName: User
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月8日 下午8:25:48
 */
public class User {
    private String nameString;
    private Car car;

    private int num;

    /**
     * 构造器
     * 
     * @param nameString
     * @param car
     */
    public User(String nameString, Car car) {
        super();
        this.nameString = nameString;
        this.car = car;
    }

    @Override
    public String toString() {
        return "User [nameString=" + nameString + ", car=" + car + "]";
    }

}
