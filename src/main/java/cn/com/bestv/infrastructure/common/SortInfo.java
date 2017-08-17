package cn.com.bestv.infrastructure.common;
/** 
 * @author Vem
 * @date 创建时间：2017年8月17日 下午3:01:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class SortInfo {


    private SortDirection direction;
    private String sortField;

    public SortInfo(){
    	
    }
    
    
    public SortInfo(String strSortField, SortDirection sd){
    	sortField=strSortField;
    	direction=sd;
    }


	public SortDirection getDirection() {
		return direction;
	}


	public void setDirection(SortDirection direction) {
		this.direction = direction;
	}


	public String getSortField() {
		return sortField;
	}


	public void setSortField(String sortField) {
		this.sortField = sortField;
	}
}