import java.io.*;
import java.util.*;
public class FileHandProject{
static final String FILE_NAME = "students.txt";
public static void addStudent()throws IOException{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Roll No. : ");
int roll = sc.nextInt();
sc.nextLine();
System.out.println("Enter Name : ");
String name = sc.nextLine();
System.out.println("Enter Marks : ");
double marks = sc.nextDouble();
FileWriter fw = new FileWriter(FILE_NAME, true);
fw.write(roll+", "+name+", "+marks+"\n");
fw.close();
System.out.println("Student Added...");
}
public static void viewStudents() throws IOException{
BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
String line;
while((line = br.readLine()) != null){
System.out.println(line);
}br.close();
}
public static void searchStudent(int rollNo) throws IOException{
BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
String line;
boolean found = false;
while((line = br.readLine()) != null){
String[] data = line.split(",");
if(Integer.parseInt(data[0]) == rollNo){
System.out.println("Found : "+line);
found = true;
break;
}
}
if(!found)
System.out.println("Student Not Found");
br.close();
}
public static void main(String args[]) throws Exception{
Scanner sc = new Scanner(System.in);
while(true){
System.out.println("1. Add\n2. View\n3.Search\n4.Exit");
int choice = sc.nextInt();
switch(choice){
case 1:
addStudent();
break;
case 2:
viewStudents();
break;
case 3:
System.out.print("Enter Roll no. : ");
int roll = sc.nextInt();
searchStudent(roll);
break;
case 4:
System.exit(0);
}
}
}
}
