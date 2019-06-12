package persistence.impl;

import domain.Item;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import persistence.ItemDAO;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl implements ItemDAO {

    @Override
    public void updateInventoryQuantity(String itemID,int increment) {

        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        session.update("updateInventoryQuantity",itemID);
        session.commit();
        session.close();
    }

    @Override
    public int getInventoryQuantity(String itemID) {

        int result=-1;
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        result = session.selectOne("getInventoryQuantity",itemID);

        return result;
    }

    @Override
    public List<Item> getItemListByProduct(String productID) {

        List<Item> itemList = new ArrayList<Item>();
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();

        itemList = session.selectList("getItemListByProduct",productID);

        return itemList;
    }

    @Override
    public Item getItem(String itemID) {
        SqlSessionFactory sqlSessionFactory = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            System.out.println("读取配置文件失败");
        }

        SqlSession session = sqlSessionFactory.openSession();
        Item item = session.selectOne("getItem", itemID);

        return item;
    }
}
