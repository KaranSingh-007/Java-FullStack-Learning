import java.io.*;
public class FileHand5{
public static void main(String args[]) throws Exception{
BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
String line;
while((line = br.readLine()) != null){
System.out.println(line);
}br.close();
}
}