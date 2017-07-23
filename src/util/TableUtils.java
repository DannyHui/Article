package util;


import java.lang.reflect.Field;

import annotation.Column;
import annotation.Table;

/**
 * 表操作工具类
 * @author Danny
 *
 */
public class TableUtils {
	 public static String getCreateTableSQl(Class<?> clazz){
	        StringBuilder sb = new StringBuilder();
	        
	        //获取表名
	        Table table = (Table) clazz.getAnnotation(Table.class);
	        String tableName = table.tableName();
	        String tableDesc = table.description();
	        
	        sb.append("DROP TABLE IF EXISTS '"+tableName+"';\n");
	        sb.append("create table ");
	        sb.append(tableName).append("(\n");
	        
	        Field[] fields = clazz.getDeclaredFields();
	        String primaryKey = "";
	        //遍历所有字段
	        for (int i = 0; i < fields.length; i++) {
	            Column column = (Column) fields[i].getAnnotations()[0];
	            String field = column.field();
	            String type = column.type();
	            String description = column.description();
	            boolean defaultNull = column.defaultNull();
	            
	            sb.append("\t" + field).append(" ").append(type);
	            if(defaultNull){
	                if(type.toUpperCase().equals("TIMESTAMP")){
	                    sb.append(" COMMENT '"+description+"',\n");
	                }else{
	                    sb.append(" DEFAULT NULL COMMENT '"+description+"',\n");
	                }
	            }else{
	                sb.append(" NOT NULL COMMENT '"+description+"',\n");
	                if(column.primaryKey()){
	                    primaryKey = "PRIMARY KEY ("+field+")";
	                }
	            }
	        }
	        
	        if(!StringUtils.isEmpty(primaryKey)){
	            sb.append("\t").append(primaryKey);
	        }
	        sb.append("\n) DEFAULT CHARSET=utf8 COMMENT '"+tableDesc+"'");
	        
	        return sb.toString();
	    }
}
