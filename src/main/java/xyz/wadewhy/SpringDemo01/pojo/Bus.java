/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.SpringDemo01.pojo 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年2月8日 下午8:42:31 
 */
package xyz.wadewhy.SpringDemo01.pojo;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年2月8日 下午8:42:31
* 类说明
*/
/**
 * @ClassName: Bus
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月8日 下午8:42:31
 */
public class Bus {

    // 那个省的Bus
    private String provice;

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    @Override
    public String toString() {
        return "Bus [provice=" + provice + "]";
    }

}
