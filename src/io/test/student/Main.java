package io.test.student;

import java.util.Date;

public class Main {
    @Deprecated
    public static void main(String[] args){
        final StudentList sl = new StudentList();

        sl.add(new Student("Anton","Serebin",new Date(95,11,1)));
        sl.add(new Student("Petr","Kupeloff",new Date(74,07,25)));
        sl.add(new Student("Alex","Levin",new Date(89,05,05)));

        int i, n;
        for (i=0;i<2;i++) {

            if(i==1)
                n = sl.find("Alex");
            else n = sl.findsuname("Kupeloff");
            System.out.println(sl.get(n).getName());
            System.out.println(sl.get(n).getSurname());
            System.out.println(sl.get(n).getBirth().toString());
            System.out.println("-----------------");
        }
            printArray(sl);
//        int ii;
//        for (ii=0; ii < sl.p ; ii++) {
//            System.out.print(sl.get(ii).getName()+ " ") ;
//            System.out.print(sl.get(ii).getSurname()+ " ");
//            System.out.print(sl.get(ii).getBirth().toString()+ " ");
//            System.out.println("");
//        }
       if (sl.delstud("Levin")){
            System.out.println("----Ok---");
            printArray(sl);
        }

    }

    static void printArray(StudentList sl){
        int ii;
        for (ii=0; ii <  sl.p ; ii++) {
            System.out.print(sl.get(ii).getName()+ " ") ;
            System.out.print(sl.get(ii).getSurname()+ " ");
            System.out.print(sl.get(ii).getBirth().toString()+ " ");
            System.out.println("");
        }
    }

}
