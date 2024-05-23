package Slide3chuong4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Student {
    private String FullName;
    private int Age;
    public  Student() {      
    }
    public Student (String FullName, int Age){
        this.FullName = FullName;
        this.Age = Age;
    }
    public String getFullName() {
        return FullName;
    }
    public void setFullName() {
        this.FullName = FullName;
    }
    public int getAge() {
        return Age;
    }
    public void setAge() {
        this.Age = Age;
    }
    public void EnterData() {
        System.out.println("Nhap thong tin sinh vien:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien: ");
        FullName = sc.nextLine();
        System.out.print("Nhap tuoi sinh vien: ");
        Age = sc.nextInt();
    }
    public static void Display (List<Student> listStudent) {
        for (int i = 0; i < listStudent.size(); i++) {
            String fullname = listStudent.get(i).FullName;
            int age = listStudent.get(i).Age;
            System.out.println("Sinh vien: Ten : " + fullname + " , Tuoi :" + age + "\n");
        }
    }
    public static void Display(Set<Student> setStudent) {
        for (Student std : setStudent) {
            String fullname = std.FullName;
            int age = std.Age;
            System.out.println("Sinh vien: Ten: " + fullname + " , Age:" + age + "\n");
        }
    }
    public static void Add(List<Student> listStudent , int n) {
        for (int i = 0; i < n; i++) {
            Student std = new Student();
            std.EnterData();
            listStudent.add(std);
        }
    }
    public static void Add(Set<Student> setStudent , int n) {
        Student std = new Student();
        std.EnterData();
        setStudent.add(std);
    }
    public static void Update (List<Student> listStudent) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thong tin muon thay doi:");
        String fullname = sc.nextLine();
        for (int i = 0; i < listStudent.size(); i++) {
            if(listStudent.get(i).FullName.equals(fullname)) {
                Student std = new Student();
                std.EnterData();
                listStudent.set(i, std);
            }
        }
    }
    public static void Update(Set<Student> setStudent) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin muon thay doi:");
        String fullname = sc.nextLine();
        for (Student std : setStudent) {
            if (std.FullName.equals(fullname)) {
                Student newstd = new Student();
                newstd.EnterData();
                setStudent.remove(std);
                setStudent.add(newstd);
                break;
            }
        }
    }
    public static void Delete(List<Student> listsStudent) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thong tin muon xoa:");
        String fullname = sc.nextLine();
        for (int i = 0; i < listsStudent.size(); i++) {
            if (listsStudent.get(i).FullName.equals(fullname))
            listsStudent.remove(i);
        }
    }
}

