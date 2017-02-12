/**
* @Title: FtpParams.java
* @Package enixlin.jrrc.pojo.param
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2017年1月24日
* @version V1.0
*/
package enixlin.jrrc.pojo.param;

import java.io.FileInputStream;
import java.io.OutputStream;

/**
 * @ClassName: FtpParams
 * @Description: ftp连接参数类
 * @author 林振焕
 * @date 2017年1月24日
 *
 */
public class FtpParams {
	
	private String ip = "";

	private String username = "";

	private String password = "";

	private int port = 21;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}



}
