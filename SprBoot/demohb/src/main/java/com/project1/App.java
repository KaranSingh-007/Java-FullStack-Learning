package com.project1;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        StudentDao  studentDao = new StudentDao();
        Student student = new Student("ram","sham","ram@gmail.com");
        studentDao.saveStudent(student);
        System.out.println(student);
        System.out.println(student.getId());
    }
}
