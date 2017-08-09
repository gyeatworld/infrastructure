package cn.com.bestv.infrastructure.common;

import java.io.Serializable;
import java.util.List;

public interface IResultInfo<T> extends Serializable {
	public String getBusinessCode();
	public List<T> getResultSet();
	public String getDescription();
	public long getCount();
}
