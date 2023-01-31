package org.example;

import org.mockito.Mockito;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int Avg;
        StudentServ Serv = Mockito.mock(StudentServ.class);
        Student student = new Student(Serv);
        Mockito.when(Serv.gettotalmark()).thenReturn(1000);
        Mockito.when(Serv.getTotalStudent()).thenReturn(10);

        Avg = student.getAvgMark();
        System.out.println("The avg is: "+ Avg);
    }
}
