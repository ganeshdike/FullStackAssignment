package collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Program7 {
	public static void main(String[] args) {
       Student s1=new Student(1, "ganesh", "B", 367);
        Student s2=new Student(43, "sagar", "A", 400);
        Student s3=new Student(5, "jay", "A", 237);
        Student s4=new Student(7, "nitit", "B", 433);
        Student s5=new Student(8, "yash", "B", 333);
        Student s6=new Student(64, "hemant", "D", 233);
        
        TreeSet<Student> list=new TreeSet<>(new StudentComparator());
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        
        Object[] data=list.toArray();
        Iterator<Student> itr =list.iterator();
        int i=3;
        System.out.println("Top 3 : ");
        while(itr.hasNext() && i>0)
        {
            Object key=(Object) itr.next();
            Student stu1=(Student) key;
            System.out.println(stu1.getSname());
            i--;
        }
        System.out.println();
        System.out.println("Student Scored less than 50% : ");
        while(itr.hasNext())
        {
            Object key=(Object) itr.next();
            Student stu1=(Student) key;
            if(stu1.getTotalmarks()<250 && stu1.getTotalmarks()>=175)
                System.out.println(stu1.getSname());
        }
        System.out.println();
        Iterator itr1 =list.iterator();
        System.out.println("Failed Students : ");
        while(itr1.hasNext())
        {
            Object key=(Object) itr1.next();
            Student stu1=(Student) key;
            if(stu1.getTotalmarks()<175)
                System.out.println(stu1.getSname());
        }
        System.out.println();
        Iterator itr2 =list.iterator();
        int count = 0; int allMarks=0; float average;
        while(itr2.hasNext())
        {
            Object key=(Object) itr2.next();
            Student stu1=(Student) key;
            allMarks= allMarks+stu1.getTotalmarks();
            count++;
        }
        average=allMarks/count;
        Iterator itr3 =list.iterator();
        System.out.println("Students Scored above average : ");
        while(itr3.hasNext())
        {
            Object key=(Object) itr3.next();
            Student stu1=(Student) key;
            if(stu1.getTotalmarks()>average)
                System.out.println(stu1.getSname());
        }
        System.out.println();
        Scanner sc=new Scanner(System.in);
        Iterator itr4 =list.iterator();
        System.out.println("Enter Name of Student to get all details : ");
        String name=sc.next();
        while(itr4.hasNext())
        {
            Object key=(Object) itr4.next();
            Student stu1=(Student) key;
            if(stu1.getSname().equals(name)) {
                System.out.println(stu1.getSname());
                System.out.println(stu1.getClassname());
                System.out.println(stu1.getRollno());
                System.out.println(stu1.getTotalmarks());
            }            
        }
        System.out.println();        
    }}
