 /**
* @Title: Role.java
* @Package enixlin.jrrc.pojo
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年2月15日
* @version V1.0
*/
package enixlin.jrrc.pojo;

/**
* @ClassName: Role
* @Description: TODO(这里用一句话描述这个类的作用)
* @author linzhenhuan
* @date 2017年2月15日
*
*/
public class Role {

	private String roleName;
	private int id;
	private int status;
	
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
