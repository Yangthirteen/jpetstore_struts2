package persistence.impl;

import domain.Sequence;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import persistence.SequenceDAO;

import java.io.IOException;
import java.io.InputStream;

public class SequenceDAOImpl implements SequenceDAO
{

    @Override
    public Sequence getSequence(Sequence sequence) {

        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        Sequence sequence1 = session.selectOne("getSequence",sequence);
        return sequence1;
    }

    @Override
    public void updateSequence(Sequence sequence) {

        SqlSessionFactory sqlSessionFactory = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            System.out.println("读取配置文件失败");
        }

        SqlSession session = sqlSessionFactory.openSession();
        session.update("updateSequence", sequence);
        session.commit();
        session.close();
    }
}
