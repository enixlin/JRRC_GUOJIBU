package enixlin.jrrc.service;

import java.io.File;

/**
 * 
* @ClassName: UpdateService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author linzhenhuan
* @date 2017年3月5日
*
 */
public interface UpdateService {
	
	public File[] getFilesFromFTP() throws Exception;

}
