package io.test.student;

import java.util.Date;

public class Main {
    @Deprecated
    public static void main(String[] args){
        final StudentList sl = new StudentList();

        sl.add(new Student("Anton","Serebin",new Date(1995,11,1)));
        sl.add(new Student("Petr","Kupeloff",new Date(1974,07,25)));
        sl.add(new Student("Alex","Levin",new Date(1989,05,05)));

        int n = sl.find("Alex");
        System.out.println(sl.get(n).getName());
        System.out.println(sl.get(n).getSurname());
        System.out.println(sl.get(n).getBirth().toString());
    }
}
