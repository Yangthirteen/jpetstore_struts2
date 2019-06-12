package persistence.impl;

import domain.LineItem;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import persistence.LineItemDAO;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class LineItemDAOImpl implements LineItemDAO
{
    @Override
    public List<LineItem> getLineItemsByOrderId(int orderId) {
        List<LineItem> lineItemList=new ArrayList<LineItem>();
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        lineItemList = session.selectList("getLineItemsByOrderId",orderId);
        return lineItemList;
    }

    @Override
    public void insertLineItem(LineItem lineItem) {
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        session.insert("insertLineItem",lineItem);
        session.commit();
        session.close();
    }
}
