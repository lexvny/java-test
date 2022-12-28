package ks1;
public class Student {     //定义一个学生类

    private String sid;//学生学号
    private String name;//学生姓名
    private String age;//学生年龄
    private String address;//学生居住地

    public Student() {//无参构造
    }

    public Student(String sid, String name, String age, String address) {//带参构造
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getSid() {//根据每个成员变量给出get/set方法
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
