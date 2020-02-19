package com.example.demo;

import java.sql.Connection;

import javax.sql.DataSource;

import com.example.demo.service.BoardServiceImpl;
import com.example.demo.vo.BoardVO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ContextConfiguration(locations = "/applicationContext.xml")
public class TestMybatis {

    @Autowired
    private DataSource ds;
       
    @Autowired
    private SqlSessionFactory sqlFactory;

    @Autowired
    BoardServiceImpl service;
    
    @Test
    public void write(BoardVO boardVO) throws Exception {
		this.service.write(boardVO);
		
	}
 
    @Test
    public void test() throws Exception{

        try(Connection conn = ds.getConnection()){
            System.out.println(conn);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
   
  
    @Test
    public void factoryTest() {
        System.out.println(sqlFactory);
      
    }
  
    @Test
    public void sessionTest() throws Exception{
      
        try(SqlSession session = sqlFactory.openSession()) {
            System.out.println(session);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}