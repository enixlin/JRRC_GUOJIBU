/**
* @Title: UpdateController.java
* @Package enixlin.jrrc.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年3月3日
* @version V1.0
*/
package enixlin.jrrc.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import enixlin.jrrc.service.UpdateService;

/**
 * @ClassName: UpdateController
 * @Description: 数据库更新控制器
 * @author linzhenhuan
 * @date 2017年3月3日
 *
 */
@Controller
public class UpdateController {

	@Autowired
	private UpdateService updateService;

	@RequestMapping("getparams.do")
	public HashMap<String, String> getparams(HttpServletRequest request) throws Exception {
		HashMap<String, String> kv = updateService.getFtpParams(request);
		return kv;

	}



	@RequestMapping("ftp.do")
	public void testDownload(HttpServletRequest request) throws Exception {
		// 从jrrc.ini配置文件读取FTP服务器IP、用户信息等
		HashMap<String, String> kv = updateService.getFtpParams(request);
		//System.out.println("==========================ftp.do=========================");
		FTPClient ftpClient = new FTPClient();
		FileOutputStream fos = null;

		try {
			String Host = kv.get("host");
			String name = kv.get("name");
			String password = kv.get("password");

			ftpClient.connect(Host);
			ftpClient.login(name, password);

			String remoteFileName = "/20170103/ifx_iss_cfmbusi.dat";
			fos = new FileOutputStream("e:/ifx_iss_cfmbusi.dat");

			ftpClient.setBufferSize(1024);
			// 设置文件类型（二进制）
			ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
			ftpClient.retrieveFile(remoteFileName, fos);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("FTP客户端出错！", e);
		} finally {
			IOUtils.closeQuietly(fos);
			try {
				ftpClient.disconnect();
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("关闭FTP连接发生异常！", e);
			}
		}
	}

}
