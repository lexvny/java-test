package ks1;
import java.util.ArrayList;
import java.util.Scanner;

    public class StudentManager {
        public static void main(String[] args) {
            //创建一个集合对象用于存储学生信息
            ArrayList<Student> array=new ArrayList<Student>();
            //循环完成再次回到主页面
            while (true) {
                Scanner sc = new Scanner(System.in);
                //输出语句完成学生信息管理系统主页面的编写
                System.out.println("-------欢迎来到学生管理系统-------");
                System.out.println("请给出你要进行的操作：");
                System.out.println("1.添加学生信息");
                System.out.println("2.删除学生信息");
                System.out.println("3.修改学生信息");
                System.out.println("4.查看所有学生信息");
                System.out.println("5.退出系统");
                System.out.println("请输入你的选择序号：");
                //键盘录入使用者要进行的操作
                String  line= sc.nextLine();
                //用switch语句完成操作的选择
                switch (line) {
                    case "1":
                    //添加学生信息
                        addStudent( array);
                        break;
                    case "2":
                    //S删除学生信息
                        deleteStudent( array);
                        break;
                    case "3":
                    //修改学生信息
                        updateStudent( array);
                        break;
                    case "4":
                    // 查看所有学生信息
                        findStudent( array);
                        break;
                    case "5":
                    // 感谢你的使用,退出系统
                     System.out.println("感谢你的使用!");
                        System.exit(0);//JVM退出，退出java虚拟机

                }
            }


        }

        //定义一个方法，用于系统添加学生信息
        public static void addStudent(ArrayList<Student> array){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生学号");
            String sid = sc.nextLine();//获取学生学号
            Student s=new Student();//创建学生类对象
            s.setSid(sid);
            int a=-1;
            for(int i=0;i<array.size();i++){//运用一个循环语句匹配输入的学号与集合中的学号
                Student h=array.get(i);
                if(h.getSid().equals(sid)){
                    a=i;
                    break;
                }
            }
            if(a!=-1){//学生信息已经存在，不能再次输入
                System.out.println("该学生信息已经存在，请重新输入！");
            }else {
                System.out.println("请输入学生姓名");
                String name = sc.nextLine();
                System.out.println("请输入学生年龄");
                String age = sc.nextLine();
                System.out.println("请输入学生居住地");
                String address = sc.nextLine();
                s.setName(name);
                s.setAge(age);
                s.setAddress(address);
                //将学生对象添加到集合中去
                array.add(s);
                //信息添加成功提示
                System.out.println("添加学生信息成功");
            }
        }

        //定义一个方法，用于系统查找学生信息
        public static void findStudent(ArrayList<Student> array){
            //判断集合中是否有数据，如果没有显示提示信息
            if(array.size()==0){
                System.out.println("系统暂无学生信息，请先输入信息！");
                return;//程序不再向下执行
            }
            //显示表头信息
            System.out.println("学 号\t姓 名\t年 龄\t\t居住地");
            for(int i=0;i<array.size();i++) {
                Student s = array.get(i);
                //输出学生信息
                 System.out.println(s.getSid()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"岁\t\t"+s.getAddress());
            }
        }

        //定义一个方法，用于系统删除学生信息
        public static void deleteStudent(ArrayList<Student> array){
            Scanner sc=new Scanner(System.in);
            //判断集合中是否有数据，如果没有显示提示信息
            if(array.size()==0){
                System.out.println("系统暂无学生信息，请先输入信息！");
                return;//程序不再向下执行
            }
            System.out.println("请输入你要删除的学号：");
            //输入要删除的学生学号，同时给出提示信息
            String sid=sc.nextLine();
            int a=-1;
            for(int i=0;i<array.size();i++){//同添加学生信息一样，运用一个循环语句匹配输入的学号与集合中的学号
                Student s=array.get(i);
                if(s.getSid().equals(sid)){
                    a=i;
                    break;
                }
            }
            if(a==-1){//不存在学生信息，无法删除
                System.out.println("该学生信息不存在，请重新输入！");
            }else{
                array.remove(a);
                //学生信息删除成功提示
                System.out.println("删除学生信息成功！");
            }
        }

        //定义一个方法，用于系统修改学生信息
        public static void updateStudent(ArrayList<Student> array) {
            Scanner sc = new Scanner(System.in);
            //判断集合中是否有数据，如果没有显示提示信息
            if (array.size() == 0) {
                System.out.println("系统暂无学生信息，请先输入信息！");
                return;//程序不再向下执行
            }
            System.out.println("请输入你要修改学生的学号：");
            //输入要修改的学生学号，同时给出提示信息
            String sid = sc.nextLine();
            int a = -1;
            for (int i = 0; i < array.size(); i++) {//同添加学生信息一样，运用一个循环语句匹配输入的学号与集合中的学号
                Student s = array.get(i);
                if (s.getSid().equals(sid)) {
                    a = i;
                    break;
                }
            }
            if (a == -1) {//不存在学生信息，无法删除
                System.out.println("该学生信息不存在，请重新输入！");
            } else {
                System.out.println("请输入学生新姓名：");
                String name = sc.nextLine();
                System.out.println("请输入学生新年龄：");
                String age = sc.nextLine();
                System.out.println("请输入学生新居住地：");
                String address = sc.nextLine();
                Student s = new Student();
                s.setSid(sid);
                s.setName(name);
                s.setAge(age);
                s.setAddress(address);
                //修改集合中对应学生信息
                for (int x = 0; x < array.size(); x++) {
                    Student t = array.get(x);
                    if (t.getSid().equals(sid)) {
                        array.set(x, s);
                        break;
                    }
                }
                //学生信息修改成功提示
                System.out.println("修改学生信息成功！");
            }
        }
    }