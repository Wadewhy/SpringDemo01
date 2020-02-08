/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.SpringDemo01.pojo 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年2月8日 下午6:07:01 
 */
package xyz.wadewhy.SpringDemo01.pojo;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年2月8日 下午6:07:01
* 类说明
*/
/**
 * @ClassName: Car2
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月8日 下午6:07:01
 */
public class Car2 {
    // 牌子
    private String brand;
    // 价格
    private double price;
    // 混淆double
    private double ceshi;
    // 时速
    private int Speed;

    // 主人
    private String owner;

    /**
     * 构造器
     * 
     * @param brand
     * @param speed
     * @param owner
     */
    public Car2(String brand, String owner, int speed) {
        super();
        this.brand = brand;
        this.Speed = speed;
        this.owner = owner;
    }

    /**
     * 构造器
     * 
     * @param brand
     * @param price
     * @param owner
     */
    public Car2(String brand, String owner, double price) {
        super();
        this.brand = brand;
        this.price = price;
        this.owner = owner;
    }

    /**
     * 构造器
     * 
     * @param brand
     * @param price
     * @param owner
     */
    public Car2(String brand, double ceshi, String owner) {
        super();
        this.brand = brand;
        this.ceshi = ceshi;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car2 [brand=" + brand + ", price=" + price + ", ceshi=" + ceshi + ", Speed=" + Speed + ", owner="
                + owner + "]";
    }

}
