package enixlin.jrrc.service;

import java.io.File;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

/**
 * 
* @ClassName: UpdateService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author linzhenhuan
* @date 2017年3月5日
*
 */
public interface UpdateService {
	
	/**
	 * 
	* @Title: getFtpParams
	* @Description:取得FTP服务器连接参数
	* @param @param request
	* @param @return
	* @param @throws Exception    参数
	* @return HashMap<String,String>    返回类型
	* @throws
	 */
	public HashMap<String, String> getFtpParams(HttpServletRequest request) throws Exception;
	public File[] getFilesFromFTP() throws Exception;

}
