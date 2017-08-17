package cn.com.bestv.infrastructure.common;
/** 
 * @author Vem
 * @date 创建时间：2017年8月17日 下午2:49:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class PagerInfo {
	private int currentPageIndex;
	private int limit;
	private int start;
    public PagerInfo(){
    	
    }
    public PagerInfo(int iStart, int iLimit){
    	start=iStart;
    	limit=iLimit;
    	
    }
    
    public int getStart() {
		return start;
	}
	public int getLimit() {
		return limit;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
    
}
