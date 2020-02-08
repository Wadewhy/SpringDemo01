/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.SpringDemo01.pojo 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年2月8日 下午9:11:19 
 */
package xyz.wadewhy.SpringDemo01.pojo;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年2月8日 下午9:11:19
* 类说明 工厂类
*/
/**
 * @ClassName: CarFactory
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月8日 下午9:11:19
 */
public class CarFactory {

    /**
     * 静态工厂
     * 
     * @return
     */
    public static Car createCar() {
        Car car = new Car("奥迪", 25890.78, 45);
        return car;
    }

    /**
     * 静态工厂
     * 
     * @return
     */

    public static Car2 createCar1() {
        Car2 car = new Car2("大众", "wadewhy", 45);
        return car;
    }

    /**
     * 非静态工厂
     * 
     * @return
     */

    public Car2 createCar2() {
        Car2 car = new Car2("五菱宏光", "wadewhy", 98000.78);
        return car;
    }
}
