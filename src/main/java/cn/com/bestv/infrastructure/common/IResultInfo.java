package cn.com.bestv.infrastructure.common;
/** 
 * @author Vem
 * @date 创建时间：2017年8月17日 下午2:39:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
import java.io.Serializable;
import java.util.List;

public interface IResultInfo<T> extends Serializable {
	public String getBusinessCode();
	public List<T> getResultSet();
	public String getDescription();
	public long getCount();
}
