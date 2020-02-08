/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.SpringDemo01.pojo 
 * @author: wadewhy   
 * @date: 2020年2月3日 下午4:51:05 
 */
package xyz.wadewhy.SpringDemo01.pojo;

import java.util.List;
import java.util.Map;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年2月3日 下午4:51:05
* 类说明
*/
/**
 * @ClassName: CollectionClass
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月3日 下午4:51:05
 */
public class CollectionClass {
    private List<String> list;
    private Map<Family, Persons> map;
    private int[] ints;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<Family, Persons> getMap() {
        return map;
    }

    public void setMap(Map<Family, Persons> map) {
        this.map = map;
    }

    public int[] getInts() {
        return ints;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }
}