package com.hujingcheng;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatis {
    public static void main(String[] args) throws IOException {
        //1.加载myBatis的核心配置文件，创建SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSession对象，用其执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.执行sql语句
        List<testStuData> objects = sqlSession.selectList("test.selectAll");
        System.out.println(objects);


        //4.释放资源
        sqlSession.close();
    }

}
