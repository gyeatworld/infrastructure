package cn.com.bestv.infrastructure.common;

import java.io.Serializable;
import java.util.List;

/** 
 * @author Vem
 * @date 创建时间：2017年8月7日 下午4:09:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class QueryResult<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<T> listResultSet=null;
	private long lTotalResultCount=0;
	
	public QueryResult(List<T> result,long count) {
		listResultSet=result;
		lTotalResultCount=count;
		
	}
	
	public List<T> getResultSet(){
		return listResultSet;
	}
	public void setResultSet(List<T> result){
		listResultSet=result;
	}
	
	public long getTotalResultCount(){
		return lTotalResultCount;
		
	}
	public void setTotalResultCount(int count){
		lTotalResultCount=count;
		
	}
}
