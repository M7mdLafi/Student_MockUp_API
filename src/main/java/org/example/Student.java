package org.example;

public class Student {
    StudentServ Serv;

    Student(StudentServ Serv){
        this.Serv = Serv;
    }
    int getAvgMark(){
        return Serv.gettotalmark() / Serv.getTotalStudent();

    }
}
