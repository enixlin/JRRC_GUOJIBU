 /**
* @Title: PowerService.java
* @Package enixlin.jrrc.service
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年2月6日
* @version V1.0
*/
package enixlin.jrrc.service;

import java.util.ArrayList;

import enixlin.jrrc.pojo.Power;
import enixlin.jrrc.pojo.User;

/**
* @ClassName: PowerService
* @Description: 用户权限接口
* @author linzhenhuan
* @date 2017年2月6日
*
*/
public interface PowerService {
	
	
	public ArrayList<Power> getPowers(User user) throws Exception;

}
