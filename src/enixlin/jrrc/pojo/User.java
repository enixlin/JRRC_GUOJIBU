package enixlin.jrrc.pojo;

import java.util.List;
import java.util.Map;

public class User {

	private List<User> UserList;
	private Map<String ,Object> userMap;

	private String name;
	private String password;
	private int id;
	
	private String oa_password;
	private String oa_name;
	
	public String getOa_password() {
		return oa_password;
	}
	public void setOa_password(String oa_password) {
		this.oa_password = oa_password;
	}
	public String getOa_name() {
		return oa_name;
	}
	public void setOa_name(String oa_name) {
		this.oa_name = oa_name;
	}
	public List<User> getUserList() {
		return UserList;
	}
	public void setUserList(List<User> userList) {
		UserList = userList;
	}
	private int status;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", id=" + id + "]";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
