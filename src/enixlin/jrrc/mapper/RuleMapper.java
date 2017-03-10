 /**
* @Title: RoleMapper.java
* @Package enixlin.jrrc.mapper
* @Description: TODO(用一句话描述该文件做什么)
* @author linzhenhuan
* @date 2017年2月23日
* @version V1.0
*/
package enixlin.jrrc.mapper;

import java.util.ArrayList;

import enixlin.jrrc.pojo.Role;
import enixlin.jrrc.pojo.Rule;

/**
* @ClassName: RuleMapper
* @Description: 权限表操作类
* @author linzhenhuan
* @date 2017年2月23日
*
*/
public interface RuleMapper {
	
	
	public int AddRule(Rule rule) throws Exception;
	
	public int ModifyRule(Rule rule) throws Exception;
	
	public int DeleteRule(Rule rule) throws Exception;
	
	public ArrayList<Rule> getAllRule()throws Exception;

}
