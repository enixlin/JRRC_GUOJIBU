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

import org.apache.catalina.connector.InputBuffer;
import org.springframework.stereotype.Service;

import enixlin.jrrc.service.UpdateService;

/**
* @ClassName: UpdateServiceImpl
* @Description: TODO(这里用一句话描述这个类的作用)
* @author linzhenhuan
* @date 2017年3月5日
*
*/
@Service
public class UpdateServiceImpl implements UpdateService {

	/* (non-Javadoc)
	 * @see enixlin.jrrc.service.UpdateService#getFtpParams()
	 */
	@Override
	public HashMap<String, String> getFtpParams() throws Exception {
		// 读取Ftp配置文件
		FileInputStream fis;
		
		String IniFileName = "/jrrc.ini"; 
		//request.getRealPath(request.getServletPath());
		File file=new File( IniFileName);
	System.out.println(file.getAbsolutePath());
		Map<String, String> params=new HashMap();
		InputStream is=new FileInputStream(file);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			
			String content="";
			String row="";
			while((row=br.readLine())!=null){
				String[] kv=row.split("=");
				params.put(kv[0], kv[1]);
			}
		
		return (HashMap<String, String>) params;
	}

	/* (non-Javadoc)
	 * @see enixlin.jrrc.service.UpdateService#getFilesFromFTP()
	 */
	@Override
	public File[] getFilesFromFTP() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
