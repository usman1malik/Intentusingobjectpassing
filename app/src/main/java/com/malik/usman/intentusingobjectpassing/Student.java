package com.malik.usman.intentusingobjectpassing;

import java.io.Serializable;

public class Student implements Serializable {


    private String frst_name,Lst_name,deptmnt,email,city;
    private int age,cntat_num,curnt_smster;


    public String getFrst_name(String s)
    {
        return frst_name;
    }

    public void setFrst_name(String frst_name) {
        this.frst_name = frst_name;
    }

    public String getLst_name(String s) {
        return Lst_name;
    }

    public void setLst_name(String lst_name) {
        Lst_name = lst_name;
    }

    public String getDeptmnt(String s) {
        return deptmnt;
    }

    public void setDeptmnt(String deptmnt) {
        this.deptmnt = deptmnt;
    }

    public String getEmail(String s) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity(String s) {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge(int s) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCntat_num(int s) {
        return cntat_num;
    }

    public void setCntat_num(int cntat_num) {
        this.cntat_num = cntat_num;
    }

    public int getCurnt_smster(int s) {
        return curnt_smster;
    }

    public void setCurnt_smster(int curnt_smster) {
        this.curnt_smster = curnt_smster;
    }

    public String toString() {
        return "Student " + frst_name + "\n" + " " + Lst_name
                + "\n" +" " + deptmnt + "\n" + "" + age + "\n" + " " + city;
    }



}
