/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.SpringDemo01.pojo 
 * @author: wadewhy   
 * @date: 2020年2月3日 下午4:46:46 
 */
package xyz.wadewhy.SpringDemo01.pojo;

public class Persons {
    private String personName; // 人的名字
    private int personAge; // 人的年龄

    /**
     * 构造器
     */
    public Persons() {
        super();
    }

    public Persons(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String toString() {
        return "personName = " + personName + ", personAge = " + personAge;
    }
}