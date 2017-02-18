 /**
* @Title: AuthorController.java
* @Package enixlin.jrrc.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年2月15日
* @version V1.0
*/
package enixlin.jrrc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import enixlin.jrrc.pojo.Role;
import enixlin.jrrc.service.AuthorService;


/**
* @ClassName: AuthorController
* @Description: 权限控制器
* @author linzhenhuan
* @date 2017年2月15日
*
*/
@Controller
public class AuthorController {
	
@Autowired
private AuthorService authorservice;
	
	@RequestMapping("addrole.do")
	public void addRole() throws Exception{
		Role role=new Role();
		role.setId(188);
		role.setRoleName("test");
		role.setStatus(1);
		authorservice.AddRole(role);		
	}

}
