 /**
* @Title: AuthorServiceImpl.java
* @Package enixlin.jrrc.service.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年2月15日
* @version V1.0
*/
package enixlin.jrrc.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enixlin.jrrc.mapper.AuthorMapper;
import enixlin.jrrc.pojo.Role;
import enixlin.jrrc.service.AuthorService;

/**
* @ClassName: AuthorServiceImpl
* @Description: TODO(这里用一句话描述这个类的作用)
* @author linzhenhuan
* @date 2017年2月15日
*
*/
@Service
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
	private AuthorMapper authormapper;
	
	@Override
	public int AddRole(Role role) throws Exception  {
	int insertCount=	authormapper.AddRole(role);
		return insertCount;
		
	}


	@Override
	public int DeleteRole(Role role) throws Exception {
		int deleteCount=authormapper.DeleteRole(role);
		return deleteCount;
	}


	@Override
	public int ModifyRole(Role role) throws Exception {
		int modifyCount=authormapper.ModifyRole(role);
		return modifyCount;
	}


	@Override
	public ArrayList<Role> getRole() throws Exception {
		ArrayList<Role> roleList=authormapper.getRole();
		return roleList;
	}

}
