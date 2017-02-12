	package enixlin.jrrc.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enixlin.jrrc.mapper.UserMapper;
import enixlin.jrrc.pojo.User;
import enixlin.jrrc.pojo.UserCustomVo;
import enixlin.jrrc.service.UserService;

/**
 * 
* @ClassName: UserServiceImpl
* @Description: 统用户处理（增、删、改、查）功能的实现
* @author 林振焕
* @date 2017年1月22日
*
 */
@Service
public class UserServiceImpl implements UserService {


	@Autowired
	private UserMapper userMapper;

	/* (non-Javadoc)
	 * @see enixlin.jrrc.service.UserService#getUserById(enixlin.jrrc.pojo.UserCustomVo)
	 */
	@Override
	public ArrayList<User> getUserById(UserCustomVo userCustomVo) throws Exception {
	ArrayList<User>	list=  userMapper.getUserById(userCustomVo);
		return list;
	}

	/* (non-Javadoc)
	 * @see enixlin.jrrc.service.UserService#getUserByName(enixlin.jrrc.pojo.UserCustomVo)
	 */
	@Override
	public ArrayList<User> getUserByName(UserCustomVo userCustomVo) throws Exception {
		ArrayList<User>	list=  userMapper.getUserByName(userCustomVo);
		return list;
	}

	/* (non-Javadoc)
	 * @see enixlin.jrrc.service.UserService#addUser(enixlin.jrrc.pojo.UserCustomVo)
	 */
	@Override
	public int addUser(UserCustomVo userCustomVo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see enixlin.jrrc.service.UserService#modifyUser(enixlin.jrrc.pojo.UserCustomVo)
	 */
	@Override
	public void modifyUser(UserCustomVo userCustomVo) throws Exception {
		userMapper.modifyUser(userCustomVo);
	}

	/* (non-Javadoc)
	 * @see enixlin.jrrc.service.UserService#deleteUser(enixlin.jrrc.pojo.UserCustomVo)
	 */
	@Override
	public int deleteUser(UserCustomVo userCustomVo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see enixlin.jrrc.service.UserService#valitUser(enixlin.jrrc.pojo.UserCustomVo)
	 */
	@Override
	public boolean valitUser(UserCustomVo userCustomVo) throws Exception {
		//取得所有的用户
		ArrayList userlist=userMapper.getUserById(userCustomVo);
		boolean exist_flag=false;
		String UserName=userCustomVo.getUser().getName();
		String Password=userCustomVo.getUser().getPassword();
		for(int n=0;n<userlist.size();n++){
			User user=(User) userlist.get(n);
			if(UserName.equals(user.getName()) && Password.equals(user.getPassword())){
				exist_flag=true;
			}
		}
		return exist_flag?true:false;
	}


}
