package persistence.impl;

import domain.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import persistence.ProductDAO;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

   @Override
    public List<Product> getProductListByCategory(String categoryID) {

        List<Product> productList=new ArrayList<Product>();
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        productList = session.selectList("getProductListByCategory",categoryID);
        return productList;
    }

    @Override
    public Product getProduct(String productID) {
        Product product=null;
        SqlSessionFactory sqlSessionFactory = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            System.out.println("读取配置文件失败");
        }

        SqlSession session = sqlSessionFactory.openSession();
        product = session.selectOne("getProduct", productID);
        return product;
    }

    @Override
    public List<Product> searchProductList(String keywords) {
        List<Product> productList = new ArrayList<Product>();
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        productList = session.selectList("searchProductList",keywords);
        return productList;
    }

}
