/**
* @Title: UpdateServiceImpl.java
* @Package enixlin.jrrc.service.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年3月5日
* @version V1.0
*/
package enixlin.jrrc.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.InputBuffer;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import enixlin.jrrc.service.UpdateService;

/**
 * @ClassName: UpdateServiceImpl
 * @Description: 更新数据库实现类
 * @author linzhenhuan
 * @date 2017年3月5日
 *
 */
@Service
public class UpdateServiceImpl implements UpdateService {

	// private String url=this.getClass().getServletContext().getRealPath("/");
	/*
	 * (non-Javadoc)
	 * 
	 * @see enixlin.jrrc.service.UpdateService#getFtpParams()
	 */
	@Override
	public HashMap<String, String> getFtpParams(HttpServletRequest request) throws Exception {
		// 读取Ftp配置文件
		FileInputStream fis;
		// 在web项目根目录下的jrrc.ini配置文件
		String IniFileName = "/jrrc.ini";
		// 取得上述配置文件的真实路径
		String path = request.getSession().getServletContext().getRealPath(IniFileName);
		// System.out.println("**************************************************************");
		// System.out.println(path);
		// System.out.println("**************************************************************");
		File file = new File(path);
		Map<String, String> params = new HashMap();
		InputStream is = new FileInputStream(file);

		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String content = "";
		String row = "";
		while ((row = br.readLine()) != null) {
			String[] kv = row.split("=");
			params.put(kv[0], kv[1]);
		}

		return (HashMap<String, String>) params;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see enixlin.jrrc.service.UpdateService#getFilesFromFTP()
	 */
	@Override
	public File[] getFilesFromFTP() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
