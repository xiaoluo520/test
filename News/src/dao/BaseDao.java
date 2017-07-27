package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BaseDao {
     public Connection conn;
     public PreparedStatement ps;
     
     //通用的查询方法
     /*public RusultSet queryData(String sql,Object[] params){
    	 
     }*/
}
