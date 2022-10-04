package com.hujingcheng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo_JDBC {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/stu?useSSL=false";
        String username = "root";
        String password = "123123";
        Connection conn = DriverManager.getConnection(url, username, password);

        //3.定义sql语句
       //  Updata +name set colName1=data1,colName2=data2,…[where judgmentConditions]	修改数据
        String sql = "update stuData set money=50 where name ='李四'";

        //4.获取sql执行对象
        Statement stmt = conn.createStatement();

        //5.执行sql
        int cont = stmt.executeUpdate(sql);

        //6.处理
        System.out.println(cont);

        //7.释放资源
        stmt.close();
        conn.close();
    }
}
