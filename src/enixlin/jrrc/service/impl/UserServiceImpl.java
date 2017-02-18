	package enixlin.jrrc.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enixlin.jrrc.mapper.UserMapper;
import enixlin.jrrc.pojo.User;
import enixlin.jrrc.pojo.UserQueryVo;
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



	@Override
	public boolean validUser(UserQueryVo userQueryVo) throws Exception {
		//取得所有的用户
		ArrayList userlist=userMapper.getUsers(userQueryVo);
		boolean exist_flag=false;
		int UserId=userQueryVo.getUser().getId();
		String Password=userQueryVo.getUser().getPassword();
		for(int n=0;n<userlist.size();n++){
			User user=(User) userlist.get(n);
			if(UserId==user.getId() && Password.equals(user.getPassword())){
				exist_flag=true;
			}
		}
		return exist_flag?true:false;
	}


	@Override
	public int addUser(UserQueryVo userQueryVo) throws Exception {
		int insertCount=userMapper.addUser(userQueryVo);
		return insertCount;
	}


	@Override
	public int deleteUser(UserQueryVo userQueryVo) throws Exception {
		int deleteCount=userMapper.deleteUser(userQueryVo);
		return deleteCount;
	}


	@Override
	public int modifyUser(UserQueryVo userQueryVo) throws Exception {
		int modifyCount=userMapper.modifyUser(userQueryVo);
		return modifyCount;
	}


	@Override
	public User getUser(UserQueryVo userQueryVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int addUsers(UserQueryVo userQueryVo) throws Exception {
		int insertCount=userMapper.addUsers(userQueryVo);
		return insertCount;
	}


	@Override
	public int deleteUsers(UserQueryVo userQueryVo) throws Exception {
		int deleteCount=userMapper.deleteUsers(userQueryVo);
		return deleteCount;
	}


	@Override
	public int modifyUsers(UserQueryVo userQueryVo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public ArrayList<User> getUsers(UserQueryVo userQueryVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
