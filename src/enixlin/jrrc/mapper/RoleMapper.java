 /**
* @Title: RoleMapper.java
* @Package enixlin.jrrc.mapper
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年2月23日
* @version V1.0
*/
package enixlin.jrrc.mapper;

import java.util.ArrayList;

import enixlin.jrrc.pojo.Role;

/**
* @ClassName: RoleMapper
* @Description: 角色表操作类
* @author linzhenhuan
* @date 2017年2月23日
*
*/
public interface RoleMapper {
	
	
	public int AddRole(Role role) throws Exception;
	
	public int ModifyRole(Role role) throws Exception;
	
	public int DeleteRole(Role role) throws Exception;
	
	public ArrayList<Role> getAllRole()throws Exception;

}
