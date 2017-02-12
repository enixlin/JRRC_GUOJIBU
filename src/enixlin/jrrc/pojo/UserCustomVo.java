 /**
* @Title: UserCustom.java
* @Package enixlin.jrrc.pojo
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年1月27日
* @version V1.0
*/
package enixlin.jrrc.pojo;

import java.util.List;
import java.util.Map;

/**
* @ClassName: UserCustomVo
* @Description: 自定义扩展用户类，用于用户的增、删、改、查
* @author linzhenhuan
* @date 2017年1月27日
*
*/
public class UserCustomVo {
	
	
	
	
	
	private User user;
	
	private List<User> UserList;
	
	private Map<String ,Object> userMap;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUserList() {
		return UserList;
	}

	public void setUserList(List<User> userlist) {
		this.UserList = userlist;
	}

	public Map<String, Object> getUserMap() {
		return userMap;
	}

	public void setUserMap(Map<String, Object> userMap) {
		this.userMap = userMap;
	}
	
	
	

}
