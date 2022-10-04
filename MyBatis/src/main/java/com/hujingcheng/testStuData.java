package com.hujingcheng;

public class testStuData {
    private int id;
    private String name;
    private String money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "testStuData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
