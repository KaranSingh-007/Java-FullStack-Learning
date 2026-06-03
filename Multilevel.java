//Write a  java program to implement multi level inheritance

class Grandfather{
public void age(){
int Gage = 70;
System.out.println(Gage);
}
}
class Father extends Grandfather{
public void hobby(){
int Fage = 55;
String hobby = "Cricket";
System.out.println(Fage+" "+hobby);
}
}
class Son extends Father{
public void occupation(){
int Sage = 20;
String occ = "Student";
System.out.println(Sage+" "+occ);
}
}
public class Multilevel{
public static void main(String[] args){
Son s = new Son();
s.occupation();
s.hobby();
s.age();

}
}