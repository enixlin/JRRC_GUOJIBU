 /**
* @Title: RoleService.java
* @Package enixlin.jrrc.service
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年2月15日
* @version V1.0
*/
package enixlin.jrrc.service;

import java.util.ArrayList;

import enixlin.jrrc.pojo.Role;

/**
* @ClassName: RoleService
* @Description:角色管理接口
* @author linzhenhuan
* @date 2017年2月15日
*
*/
public interface RoleService {
	/**
	 * 
	* @Title: AddRole
	* @Description: 添加角色
	* @param @param role
	* @param @return
	* @param @throws Exception    参数
	* @return int    返回类型
	* @throws
	 */
	public int AddRole(Role role) throws Exception;
	
	public int ModifyRole(Role role) throws Exception;
	
	public int DeleteRole(Role role) throws Exception;
	
	public ArrayList<Role> getAllRole()throws Exception;
	
	
	
	

}
