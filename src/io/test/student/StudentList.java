package io.test.student;

import java.util.Arrays;

public class StudentList {

    private Student[] list = new Student[2];
    int p = 0;

    public void add(Student s){
        if(p > list.length-1)
            expandList();
         list[p++] = s;
    }

    private void expandList() {
        Student[] newList = new Student[list.length*2];
        for(int il=0; il<list.length;il++)
            newList[il] = list[il];
        list = newList;
    }

    public Student get(int n){
        return list[n];
    }

    public int find(String name){
        for(int i=0; i<p; i++){
            if (list[i].getName().equalsIgnoreCase(name))
                return  i;
        }
        return -1;
    }

    public int findsuname(String suname){
        for(int i=0; i<p; i++){
            if (list[i].getSurname().equalsIgnoreCase(suname))
                return  i;
        }
        return -1;
    }

    public boolean delstud(String suname){
         for(int i=0; i<p; i++){
            if (list[i].getSurname().equalsIgnoreCase(suname)) {
                for (int index = i; index < list.length - 1; index++) {
                    if (!(this.list[index + 1] == null))
                        list[index] = list[index + 1];
                    else {
                        this.list[index] = null;
                        p = p - 1;
                        break;
                    }
                }

                return true;
            }
            }

         return false;
    }

}
