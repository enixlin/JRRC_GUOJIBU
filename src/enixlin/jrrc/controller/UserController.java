package enixlin.jrrc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import enixlin.jrrc.pojo.Power;
import enixlin.jrrc.pojo.User;
import enixlin.jrrc.pojo.UserCustomVo;
import enixlin.jrrc.service.UserService;
import enixlin.jrrc.service.impl.PowerServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PowerServiceImpl powerServiceImpl;
	



	/**
	 * 
	* @Title: userlist
	* @Description: 显示所有的用户
	* @param @return
	* @param @throws Exception    参数
	* @return ModelAndView    返回类型  ArrayList<User> userList
	* @throws
	 */
	@RequestMapping("userlist.do")
	public ModelAndView userlist(
			UserCustomVo userCustomVo) throws Exception {
		
		ArrayList<User> UserList=userService.getUserByName(userCustomVo);
		userCustomVo.setUserList(UserList);
		ModelAndView modelAndView =new ModelAndView();
		
		modelAndView.setViewName("showuserlist");
		modelAndView.addObject("UserList", UserList);
		modelAndView.addObject("userCustomVo", userCustomVo);
		
		return modelAndView;
		
	}
	
	
	@RequestMapping("modifyuser.do")
	public void modifyUser(UserCustomVo userCustomVo) throws Exception{
		
		userService.modifyUser(userCustomVo);
	}
	
	
	@RequestMapping("getUserNames.do")
	public @ResponseBody ArrayList getUserNames() throws Exception{
		UserCustomVo userCustomVo=new UserCustomVo();
		ArrayList userlist=userService.getUserById(userCustomVo);
		for(int n=0;n<userlist.size();n++){
			User user=(User) userlist.get(n);
			user.setPassword("");
			user.setStatus(0);
		}
		
		return userlist;
	}
	
	
	
	@RequestMapping("getUserPowers.do")
	public @ResponseBody ArrayList<Power> getUserPowers() throws Exception{
		User user =new User();
		user.setId(95);
		ArrayList<Power> powerlist=powerServiceImpl.getPowers(user);
		return powerlist; 
		
	}
	
	

}
