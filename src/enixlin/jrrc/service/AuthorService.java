 /**
* @Title: AuthorService.java
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
* @ClassName: AuthorService
* @Description: 权限管理接口
* @author linzhenhuan
* @date 2017年2月15日
*
*/

public interface AuthorService {

	public int AddRole(Role role) throws Exception  ;
	

}
