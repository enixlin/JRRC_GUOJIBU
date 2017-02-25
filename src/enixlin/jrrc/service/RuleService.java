 /**
* @Title: RuleService.java
* @Package enixlin.jrrc.service
* @Description: 权限管理接口
* @author linzhenhuan
* @date 2017年2月15日
* @version V1.0
*/
package enixlin.jrrc.service;

import java.util.ArrayList;

import enixlin.jrrc.pojo.Role;
import enixlin.jrrc.pojo.Rule;

/**
* @ClassName: RuleService
* @Description:权限管理接口
* @author linzhenhuan
* @date 2017年2月15日
*
*/
public interface RuleService {
	
	public int AddRule(Rule rule) throws Exception;
	
	public int ModifyRule(Rule rule) throws Exception;
	
	public int DeleteRule(Rule rule) throws Exception;
	
	public ArrayList<Rule> getAllRule()throws Exception;
	
	
	
	

}
