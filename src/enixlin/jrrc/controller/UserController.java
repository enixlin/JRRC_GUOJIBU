package enixlin.jrrc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import enixlin.jrrc.pojo.User;
import enixlin.jrrc.pojo.UserQueryVo;
import enixlin.jrrc.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/add.do")
	public @ResponseBody int addUser() throws Exception {
		UserQueryVo userQueryVo = new UserQueryVo();
		User user = new User();
		user.setName("ppp");
		user.setPassword("1234");
		user.setStatus(1);
		userQueryVo.setUser(user);
		int insertCount = userService.addUser(userQueryVo);
		return insertCount;
	}

	@RequestMapping("/adds.do")
	public @ResponseBody int addUsers() throws Exception {
		UserQueryVo userQueryVo = new UserQueryVo();
		ArrayList<User> ulist = new ArrayList();
		for (int n = 0; n < 5; n++) {

			User user = new User();
			user.setName("ppp" + n);
			user.setPassword("1234" + n);
			user.setStatus(1);
			ulist.add(user);
		}
		userQueryVo.setUserList(ulist);
		int insertCount = userService.addUsers(userQueryVo);
		return insertCount;
	}

	@RequestMapping("/deletes.do")
	public @ResponseBody int deleteUsers() throws Exception {
		UserQueryVo userQueryVo = new UserQueryVo();
		ArrayList<User> ulist = new ArrayList();
		for (int n = 0; n < 5; n++) {

			User user = new User();
			user.setId(155 + n);
			ulist.add(user);
		}
		userQueryVo.setUserList(ulist);
		int insertCount = userService.deleteUsers(userQueryVo);
		return insertCount;
	}

	@RequestMapping("/delete.do")
	public @ResponseBody int deleteUser() throws Exception {
		UserQueryVo userQueryVo = new UserQueryVo();

		User user = new User();
		user.setId(156);

		userQueryVo.setUser(user);
		int insertCount = userService.deleteUser(userQueryVo);
		return insertCount;
	}
	
	@RequestMapping("/valid.do")
	public @ResponseBody boolean validUser(@RequestParam int id,@RequestParam String password) throws Exception{
		UserQueryVo userQueryVo=new UserQueryVo();
		User user=new User();
		user.setId(id);;
		user.setPassword(password);
		userQueryVo.setUser(user);
		boolean result=userService.validUser(userQueryVo);
		return result;
	}
	
	
	@RequestMapping("/getNames.do")
	public @ResponseBody ArrayList<User> getUsers() throws Exception{
		UserQueryVo userQueryVo =new UserQueryVo();
		User user1 =new User();
		userQueryVo.setUser(user1);
		ArrayList<User> userList=userService.getUsers(userQueryVo);	
		for (User user : userList) {
			user.setPassword("");
		}
		return userList;
	}
	 
	@RequestMapping("/userlist.do")
	public  String userlist() throws Exception{
		UserQueryVo userQueryVo =new UserQueryVo();
		
		ArrayList<User> userList=userService.getUsers(userQueryVo);	
	
		return "user/userlist";
	}

}
