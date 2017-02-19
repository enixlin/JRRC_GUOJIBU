package enixlin.jrrc.service;

import java.util.ArrayList;

import enixlin.jrrc.pojo.User;
import enixlin.jrrc.pojo.UserQueryVo;

/**
 * 
* @ClassName: UserService
* @Description:系统用户处理（增、删、改、查）功能的接口
* @author Administrator
* @date 2017年1月22日
*
 */
public interface UserService {
	

	//单个操作函数
	public int addUser(UserQueryVo userQueryVo) throws Exception;
	public int deleteUser(UserQueryVo userQueryVo) throws Exception;
	public int modifyUser(UserQueryVo userQueryVo) throws Exception;
	public User getUser(UserQueryVo userQueryVo) throws Exception;
	public boolean validUser(UserQueryVo userQueryVo) throws Exception;
	
	
	//批量操作函数
	public int addUsers(UserQueryVo userQueryVo) throws Exception;
	public int deleteUsers(UserQueryVo userQueryVo) throws Exception;
	public int modifyUsers(UserQueryVo userQueryVo) throws Exception;
	public ArrayList<User> getUsers(UserQueryVo userQueryVo) throws Exception;



}
