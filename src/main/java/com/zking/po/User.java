package com.zking.po;

public class User {
    private int id;
    private String username;
    private String userpwd;
    private String usersex;
    private  int mid;


    public User(String username, String userpwd, String usersex, int mid) {
        this.username = username;
        this.userpwd = userpwd;
        this.usersex = usersex;
        this.mid = mid;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", usersex='" + usersex + '\'' +
                ", mid=" + mid +
                '}';
    }
}
