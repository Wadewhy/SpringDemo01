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
 * @ClassName: Car
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月8日 下午6:07:01
 */
public class Car {
    // 牌子
    private String brand;
    // 价格
    private double price;
    // 时速
    private int Speed;

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", price=" + price + ", Speed=" + Speed + "]";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    /**
     * 构造器
     * 
     * @param brand
     * @param price
     * @param speed
     */
    public Car(String brand, double price, int speed) {
        super();
        this.brand = brand;
        this.price = price;
        Speed = speed;
    }

    /**
     * 构造器
     */
    public Car() {
        // TODO Auto-generated constructor stub
    }

}
