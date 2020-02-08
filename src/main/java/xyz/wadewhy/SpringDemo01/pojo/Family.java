/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.SpringDemo01.pojo 
 * @author: wadewhy   
 * @date: 2020年2月3日 下午4:47:58 
 */
package xyz.wadewhy.SpringDemo01.pojo;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年2月3日 下午4:47:58
* 类说明
*/
/**
 * @ClassName: Family
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月3日 下午4:47:58
 */
public class Family {
    private Persons person;
    private String familyName;

    /**
     * 构造器
     */
    public Family() {
        super();
    }

    public Family(Persons person, String familyName) {
        this.person = person;
        this.familyName = familyName;
    }

    public String toString() {
        return person.toString() + ", familyName = " + familyName;
    }
}