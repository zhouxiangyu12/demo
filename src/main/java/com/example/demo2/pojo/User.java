package com.example.demo2.pojo;

public class User {
	private long id;
    private String user_name;
    private int age;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", age=" + age +
                '}';
    }
}
