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
	
	public int AddRole(Role role) throws Exception;
	
	public int MOdifyRole(Role role) throws Exception;
	
	public int deleteRole(Role role) throws Exception;
	
	public ArrayList<Role> getAllRole()throws Exception;
	
	 
	private int a;
	

}
