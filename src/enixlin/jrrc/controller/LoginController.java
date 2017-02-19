package enixlin.jrrc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import enixlin.jrrc.pojo.User;
import enixlin.jrrc.pojo.UserQueryVo;
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
@RequestMapping("login")
@SessionAttributes({"UserName","UserID"})
public class LoginController {

	@Autowired
	private UserService uService;
	
	@Autowired  
	private HttpSession session;  
	  
	@Autowired  
	private HttpServletRequest request;  

	/**
	 * 
	 * @Title: login 
	 * @Description: 显示登录页面 
	 * @param @return 
	 * @param @throws
	 * Exception 参数 
	 * @return String 返回类型 
	 * @throws
	 */
	@RequestMapping("/index.do")
	public ModelAndView login() throws Exception {	
		ModelAndView modelAndView = new ModelAndView();
		if((User) session.getAttribute("authorUser")!=null){
			modelAndView.setViewName("isLogined"); 
		}else{
		modelAndView.setViewName("login"); 
		}
		return modelAndView;
	}
 
	@RequestMapping("valid.do")
	public @ResponseBody boolean validUser(@RequestParam int id, @RequestParam String password,ModelMap modelMap) throws Exception {
		UserQueryVo userQueryVo = new UserQueryVo();
		User user = new User();
		user.setId(id);
		user.setPassword(password);
		userQueryVo.setUser(user);
		boolean isExist = uService.validUser(userQueryVo);
		
		if(isExist==true){	
			UserQueryVo ucv=new UserQueryVo();
			ucv.setUser(user);
			User authorUser=uService.getUser(userQueryVo);
//			modelMap.addAttribute("UserName",authorUser.getName());
//			int user_id=authorUser.getId();		
//			modelMap.addAttribute("UserID",String.valueOf(user_id) );
			session.setAttribute("authorUser", authorUser);
		}
		
		return isExist;
	}

	/**
	 * 
	 * @Title: HandleAddUser **
	 * @Description: 处理添加用户 @param @param
	 * user @param @return @param @throws Exception 参数 @return String
	 * 返回类型 @throws
	 */
	@RequestMapping("HandleAddUser.do")
	public String HandleAddUser(User user) throws Exception {
		return "AddUser";
	}
	
	
	@RequestMapping("/logout.do")
	public String logout(){
		session.setAttribute("authorUser", null);
		return "logout";
	}

}
