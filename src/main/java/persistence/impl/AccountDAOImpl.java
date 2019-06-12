package persistence.impl;

import domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import persistence.AccountDAO;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDAOImpl implements AccountDAO
{

    @Override
    public Account getAccountByUsername(String username) {

        Account account = new Account();
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        account = session.selectOne("getAccountByUsername",username);

        return account;
    }

    @Override
    public Account getAccountByUsernameAndPassword(Account account) {

        Account accountNew = new Account();
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        accountNew = session.selectOne("getAccountByUsernameAndPassword",account);

        return accountNew;
    }

    @Override
    public void insertAccount(Account account) {

        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        session.insert("insertAccount",account);
        session.commit();
        session.close();
    }

    @Override
    public void insertProfile(Account account) {

        boolean mylistopt = account.isListOption();
        boolean bannerropt = account.isBannerOption();
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        session.insert("insertProfile",account);
        session.commit();
        session.close();
    }

    @Override
    public void insertSignon(Account account) {
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        session.insert("insertSignon",account);
        session.commit();
        session.close();
    }

    @Override
    public void updateAccount(Account account) {
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        session.update("updateAccount",account);
        session.commit();
        session.close();
    }

    @Override
    public void updateProfile(Account account) {
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }
        catch (IOException e){
            System.out.println("读取配置文件失败");
        }

        SqlSession session=sqlSessionFactory.openSession();
        session.update("updateProfile",account);
        session.commit();
        session.close();
    }

    @Override
    public void updateSignon(Account account) {
        SqlSessionFactory sqlSessionFactory = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            System.out.println("读取配置文件失败");
        }

        SqlSession session = sqlSessionFactory.openSession();
        session.update("updateSignon", account);
        session.commit();
        session.close();
    }
}
