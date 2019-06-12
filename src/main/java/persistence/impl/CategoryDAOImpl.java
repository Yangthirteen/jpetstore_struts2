package persistence.impl;

import domain.Category;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import persistence.CategoryDAO;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAOImpl implements CategoryDAO
{
   @Override
    public List<Category> getCategoryList() {
       List<Category> categoryList=new ArrayList<Category>();
       SqlSessionFactory sqlSessionFactory = null;
       try{
           InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
           sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

       }
       catch (IOException e){
           System.out.println("读取配置文件失败");
       }

       SqlSession session=sqlSessionFactory.openSession();
       categoryList = session.selectList("getCategoryList");
       return categoryList;


    }

    @Override
    public Category getCategory(String categoryID) {

        SqlSessionFactory sqlSessionFactory = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            System.out.println("读取配置文件失败");
        }

        SqlSession session = sqlSessionFactory.openSession();
        Category category = session.selectOne("getCategory", categoryID);

        return category;
    }
}
