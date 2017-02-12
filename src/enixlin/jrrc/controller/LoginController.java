package enixlin.jrrc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import enixlin.jrrc.pojo.User;
import enixlin.jrrc.pojo.UserCustomVo;
import enixlin.jrrc.service.UserService;


/**
* 
* @ClassName: LoginController
* @Description: 系统登录控制器
* @author 林振焕
* @date 2017年1月22日
*
*/
@Controller
public class LoginController {
	
	
	@Autowired
	private UserService userService;
	
	
	/**
	 * 
	* @Title: login
	* @Description:  显示登录页面
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	@RequestMapping("login.do")
	public String login() throws Exception{
		return "login";
	}
	
	
	
	
	
	@RequestMapping("validuser.do")
	public @ResponseBody boolean validUser(@RequestParam String name,@RequestParam String password) throws Exception{
		UserCustomVo userCustomVo=new UserCustomVo();
		User user=new User();
		user.setName(name);
		user.setPassword(password);
		userCustomVo.setUser(user);
		boolean isExist=userService.valitUser(userCustomVo);
	
		return isExist;
	}


	/**
	 * 
	* @Title: HandleAddUser
	* @Description: 处理添加用户
	* @param @param user
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	@RequestMapping("HandleAddUser.do")
	public String HandleAddUser(User user) throws Exception{
		return "AddUser";
	}
	
	
	
	
	
}
