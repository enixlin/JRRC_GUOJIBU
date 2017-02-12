 /**
* @Title: MainController.java
* @Package enixlin.jrrc.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年2月2日
* @version V1.0
*/
package enixlin.jrrc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import enixlin.jrrc.pojo.User;
import enixlin.jrrc.pojo.UserCustomVo;
import enixlin.jrrc.service.UserService;

/**
* @ClassName: MainController
* @Description: TODO(这里用一句话描述这个类的作用)
* @author linzhenhuan
* @date 2017年2月2日
*
*/

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("main.do")
	public String show(){
		
		return "main";
	}
	
	@RequestMapping("getuserinfo.do")
	public String getUserInfo(@RequestParam int id) throws Exception{
		
		UserCustomVo userCustomVo=new UserCustomVo();
		User user=new User();
		user.setId(id);
		userService.getUserById(userCustomVo);
		return "main";
	}
	

	
	
}
