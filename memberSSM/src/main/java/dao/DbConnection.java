package dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbConnection {

	public static void main(String[] args) {
		

	}
	
	public static SqlSession getDb()
	{
		
		SqlSession session=null;
		
		try {
			InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
			session=sf.openSession();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return session;
		
	}

}
