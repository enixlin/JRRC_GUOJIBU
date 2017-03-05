 /**
* @Title: UpdateController.java
* @Package enixlin.jrrc.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年3月3日
* @version V1.0
*/
package enixlin.jrrc.controller;

import java.io.FileOutputStream;
import java.net.InetAddress;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
/**
* @ClassName: UpdateController
* @Description: 数据库更新控制器
* @author linzhenhuan
* @date 2017年3月3日
*
*/
@Controller
public class UpdateController {

	@RequestMapping("ftp.do")
	public static void testDownload() { 
		
		System.out.println("==========================ftp.do=========================");
        FTPClient ftpClient = new FTPClient(); 
        FileOutputStream fos = null; 

        try { 
        	String Host="192.168.31.192";
        	
            ftpClient.connect(Host); 
            ftpClient.login("linzhenhuan", "enixlin1981"); 

            String remoteFileName = "/var/www/info.php"; 
            fos = new FileOutputStream("e:/down.php"); 

            ftpClient.setBufferSize(1024); 
            //设置文件类型（二进制） 
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
