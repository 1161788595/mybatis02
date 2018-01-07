package com.zking.test;

import com.zking.dao.IUserDao;
import com.zking.po.User;
import com.zking.po.Uservo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mybatistest {
    @Test
    public void all() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao iu = sqlSession.getMapper(IUserDao.class);
        List<User> lu = iu.all();
        for (User user : lu) {
            System.out.println(user);
        }

    }

    @Test
    public void allquery() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao iu = sqlSession.getMapper(IUserDao.class);
        List<User> lu = iu.allquery("a");
        for (User user : lu) {
            System.out.println(user);

        }

    }

    @Test
    public void allquery1() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao iu = sqlSession.getMapper(IUserDao.class);
        List<User> lu = iu.allquery1("a");

        System.out.println(lu);


    }

    @Test
    public void allquery2() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao iu = sqlSession.getMapper(IUserDao.class);
        List<User> lu = iu.allquery2("a");
        for (User user : lu) {
            System.out.println(user);
        }

    }

    @Test
    public void insert() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao iu = sqlSession.getMapper(IUserDao.class);

        User u = new User();
        u.setUsername("施正辉");
        u.setUserpwd("123");
        u.setUsersex("男");

        int i = iu.insert(u);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(i);

    }

    @Test
    public void update() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao iu = sqlSession.getMapper(IUserDao.class);

        User u = new User();
        u.setUsername("施正辉");
        u.setUserpwd("123456789shi");
        u.setUsersex("男");
        u.setId(5);

        int i = iu.update(u);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(i);

    }

    @Test
    public void delete() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao iu = sqlSession.getMapper(IUserDao.class);


        int i = iu.delete(6);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(i);

    }

    @Test
    public void getallpage() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao iu = sqlSession.getMapper(IUserDao.class);
        List<User> lu = iu.getallpage(new Uservo(0, 5,"施"));
        for (User user : lu) {
            System.out.println(user);
        }
    }

    @Test
    public void getallpage1() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao iu = sqlSession.getMapper(IUserDao.class);
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("start", 0);
        map.put("end", 2);
        List<User> lu = iu.getallpage1(map);
        for (User user : lu) {
            System.out.println(user);
        }
    }

    @Test
    public void getuserid() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao iu = sqlSession.getMapper(IUserDao.class);

        System.out.println(iu.getuserid(1));

    }

    @Test
    public void getallid() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Uservo uservo = new Uservo();
        uservo.setId(1);
        IUserDao iu = sqlSession.getMapper(IUserDao.class);

        System.out.println(iu.getallid(uservo));

    }

   /* @Test
    public void getallidor() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        Uservo uservo = new Uservo();
        uservo.setIds(li);
        IUserDao iu = sqlSession.getMapper(IUserDao.class);
        List<User> lw = iu.getallidor(uservo);

        for (User user : lw) {
            System.out.println(user);
        }
    }

    @Test
    public void getallidin() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Integer> li = new ArrayList<Integer>();
        li.add(7);
        li.add(8);
        li.add(9);
        li.add(10);
        Uservo uservo = new Uservo();
        uservo.setIds(li);
        IUserDao iu = sqlSession.getMapper(IUserDao.class);
        List<User> lw = iu.getallidin(uservo);

        for (User user : lw) {
            System.out.println(user);
        }
    }*/

    @Test
    public void getallidin1() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> li1 = new ArrayList<User>();
        User u1 = new User();
        u1.setId(1);
        User u2 = new User();
        u1.setId(2);
        User u3 = new User();
        u1.setId(3);
        User u4 = new User();
        u1.setId(4);
        li1.add(u1);
        li1.add(u2);
        li1.add(u3);
        li1.add(u4);
        Uservo uservo = new Uservo();
        uservo.setIds(li1);
        IUserDao iu = sqlSession.getMapper(IUserDao.class);
        List<User> lw = iu.getallidin1(uservo);

        for (User user : lw) {
            System.out.println(user);
        }
    }

    @Test
    public void update1() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
     IUserDao iud= sqlSession.getMapper(IUserDao.class);
     User uservo=new User();
    uservo.setUsername("施正辉");
    uservo.setUserpwd("sss");
    uservo.setUsersex("ss");
    uservo.setId(7);

     System.out.println( iud.update11(uservo));
        sqlSession.commit();
        sqlSession.close();

    }
}
