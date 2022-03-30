package io.test.student;

public class StudentList {

    private final Student[] list = new Student[100];
    int p = 0;

    public void add(Student s){
        list[p++] = s;
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
                        break;
                    }
                }
                p = p - 1;
                return true;
            }
            }

         return false;
    }

}
