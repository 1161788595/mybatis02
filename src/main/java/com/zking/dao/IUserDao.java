package com.zking.dao;

import com.zking.po.User;
import com.zking.po.Uservo;

import java.util.List;
import java.util.Map;

public interface IUserDao {
    public List<User> all();
    public List<User> allquery(String query);
    public List<User> allquery1(String query);
    public List<User> allquery2(String query);
    public int insert(User user);
    public int update(User user);
    public int delete(int id);
    public List<User> getallpage(Uservo uservo);
    public List<User> getallpage1(Map map);
    public String getuserid(int id);
    public User  getallid(Uservo uservo);
    public List<User> getallidor(Uservo uservo);
    public List<User> getallidin(Uservo uservo);
    public List<User> getallidin1(Uservo uservo);
    public int update11(User user);
 }
