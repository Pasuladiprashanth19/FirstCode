package com.deepu.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>
{
    int rollno,marks;
    String name;

    public Stud(int rollno,  String name, int marks ) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
    public int compareTo(Stud s)
    {
        return name.length()>s.name.length()?1:-1;
    }
}

public class CollectionDemo {
    public static void main(String[] args) {

        List<Stud>studs= new ArrayList<>();
        studs.add(new Stud(25,"mahesh",55));
        studs.add(new Stud(45,"raki",14));
        studs.add(new Stud(25,"dinesh",45));
        studs.add(new Stud(25,"satwikas",35));

        Collections.sort(studs,(i,j)->i.marks> j.marks?1:-1);



        for (Stud s: studs)
        {
            System.out.println(s);
        }


    }
}
