class Student{
private String name;
private int age;
public void setName(String name){
this.name = name;
}
public void setAge(int age){
if(age>0){
this.age = age;
}else{
System.out.println("INVALID AGE");
}
}
public String getName(){
return name;
}
public int getAge(){
return age;
}
}
public class Encapsulation{
public static void main(String args[]){
Student s = new Student();
s.setName("Karan");
s.setAge(21);
System.out.println(s.getName());
System.out.println(s.getAge());
}
}
