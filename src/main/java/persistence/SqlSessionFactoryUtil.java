package persistence;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SqlSessionFactoryUtil {

    private static SqlSessionFactory sf = null;

    private static String resouce = "mybatis-config.xml";

    public static SqlSessionFactory getSqlSessionFactory(){

        if(sf == null){
            try{
                InputStream inputStream = Resources.getResourceAsStream(resouce);
                sf = new SqlSessionFactoryBuilder().build(inputStream);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return sf;
    }

}
