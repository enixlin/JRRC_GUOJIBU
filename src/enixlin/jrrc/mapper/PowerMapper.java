 /**
* @Title: PowerMapper.java
* @Package enixlin.jrrc.mapper
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年2月6日
* @version V1.0
*/
package enixlin.jrrc.mapper;

import java.util.ArrayList;

import enixlin.jrrc.pojo.Power;
import enixlin.jrrc.pojo.User;

/**
* @ClassName: PowerMapper
* @Description: TODO(这里用一句话描述这个类的作用)
* @author linzhenhuan
* @date 2017年2月6日
*
*/
public interface PowerMapper {
	
	public ArrayList<Power> getUserPowers(User user) throws Exception;

}
