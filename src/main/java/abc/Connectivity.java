package abc;

import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{  
Connection con=DriverManager.getConnection("jdbc:mysql://35.185.50.205:3306/denmark", "rashmi","rashmi");  
//here denmark is database name, roger is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from users");  
while(rs.next())  
System.out.println(rs.getString(1)+" "+rs.getString(2));  
con.close();  
}catch(Exception e){ e.printStackTrace();}  
}  
}  
