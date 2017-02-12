 /**
* @Title: PowerServiceImpl.java
* @Package enixlin.jrrc.service.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年2月6日
* @version V1.0
*/
package enixlin.jrrc.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enixlin.jrrc.mapper.PowerMapper;
import enixlin.jrrc.pojo.Power;
import enixlin.jrrc.pojo.User;
import enixlin.jrrc.service.PowerService;

/**
* @ClassName: PowerServiceImpl
* @Description: TODO(这里用一句话描述这个类的作用)
* @author linzhenhuan
* @date 2017年2月6日
*
*/
@Service
public class PowerServiceImpl implements PowerService {

	/* (non-Javadoc)
	 * @see enixlin.jrrc.service.PowerService#getPowers(enixlin.jrrc.pojo.User)
	 */
	
	@Autowired
	private PowerMapper powerMapper;
	
	public ArrayList<Power> getPowers(User user) throws Exception {
		ArrayList<Power> powersList=powerMapper.getUserPowers(user);
		return powersList;
	}

}
