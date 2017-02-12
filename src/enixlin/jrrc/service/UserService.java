package enixlin.jrrc.service;

import java.util.ArrayList;

import enixlin.jrrc.pojo.User;
import enixlin.jrrc.pojo.UserCustomVo;

/**
 * 
* @ClassName: UserService
* @Description:系统用户处理（增、删、改、查）功能的接口
* @author Administrator
* @date 2017年1月22日
*
 */
public interface UserService {
	
	/**
	* @Title: getUserById
	* @Description: 以用户编号查询用户
	* @param @param userCustomVo
	* @param @return
	* @param @throws Exception    参数
	* @return ArrayList<User>    返回类型
	* @throws
	*/
	public ArrayList<User> getUserById(UserCustomVo userCustomVo) throws Exception;
	
	/**
	 * 
	* @Title: getUserByName
	* @Description: 以用户名称查询用户
	* @param @param userCustomVo
	* @param @return
	* @param @throws Exception    参数
	* @return ArrayList<User>    返回类型
	* @throws
	 */
	public ArrayList<User> getUserByName(UserCustomVo userCustomVo) throws Exception;
	
	
	
	/**
	 * 
	* @Title: addUser
	* @Description: 添加用户
	* @param @param userCustomVo
	* @param @return
	* @param @throws Exception    参数
	* @return int    返回类型 成功添加的用户个数
	* @throws
	 */
	public int addUser(UserCustomVo userCustomVo) throws Exception;
	
	/**
	 * 
	* @Title: modifyUser
	* @Description: 修改用户信息
	* @param @param userCustomVo
	* @param @return
	* @param @throws Exception    参数
	* @return int    返回类型 成功修改的用户个数
	* @throws
	 */
	public void modifyUser(UserCustomVo userCustomVo) throws Exception;
	
	
	/**
	 * 
	* @Title: deleteUser
	* @Description: 删除用户
	* @param @param userCustomVo
	* @param @return
	* @param @throws Exception    参数
	* @return int    返回类型  成功删除的用户个数
	* @throws
	 */
	public int deleteUser(UserCustomVo userCustomVo) throws Exception;
	
	
	

	/**
	 * 
	* @Title: valitUser
	* @Description: 验证用户
	* @param @param userCustomVo
	* @param @return
	* @param @throws Exception    参数
	* @return boolean    返回类型 成功返回true   不成功返回false
	* @throws
	 */
	public boolean valitUser(UserCustomVo userCustomVo) throws Exception;
	



}
