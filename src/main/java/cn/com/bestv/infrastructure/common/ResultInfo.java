package cn.com.bestv.infrastructure.common;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author Vem
 * @date 创建时间：2017年8月7日 下午4:10:10 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class ResultInfo<T> implements IResultInfo<T> {
	
	private static final long serialVersionUID = 1361075392702990964L;
	
	private String businessCode;
	private List<T> resultSet; 
	private String description; 
	private long count;
	int i=0;
	
	public ResultInfo(String strBusinessCode,List<T> listResultSet, long lCount, String strDescription) {
		businessCode=strBusinessCode;
		resultSet=listResultSet;
		description=strDescription;
		count=lCount;
	}
	
	public ResultInfo(String strBusinessCode , QueryResult<T> qrResult , String strDescription){
		businessCode=strBusinessCode;
		if (qrResult!=null) {
			resultSet=qrResult.getResultSet();
			count=qrResult.getTotalResultCount();
		}else{
			count=0;
			resultSet=new ArrayList<T>();
		}
		description=strDescription;
		
	}

	@Override
	public String getBusinessCode() {
		// TODO Auto-generated method stub
		return businessCode;
	}

	@Override
	public List<T> getResultSet() {
		// TODO Auto-generated method stub
		return resultSet;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public long getCount() {
		// TODO Auto-generated method stub
		return count;
	}

}
