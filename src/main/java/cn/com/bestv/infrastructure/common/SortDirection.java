package cn.com.bestv.infrastructure.common;
/** 
 * @author Vem
 * @date 创建时间：2017年8月17日 下午2:09:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public enum SortDirection { 
	
   Ascending(0), 
   
   Descending(1);
   
   private int _iDirection; 
   
   private SortDirection(int iDirection) { 
       this._iDirection = iDirection; 
   } 
       
    
}


