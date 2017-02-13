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
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

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
@RequestMapping("main")
@SessionAttributes({"User","Y"})
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("index.do")
	public ModelAndView show(ModelMap modelMap){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("UserName", modelMap.get("User"));
		modelAndView.setViewName("main");
		
		return modelAndView;
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
