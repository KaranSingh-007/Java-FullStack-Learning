import java.io.*;
public class FileHand6{
public static void main(String args[])throws Exception{
BufferedWriter bw = new BufferedWriter(new FileWriter("demo.txt",true));
bw.write("\nKaran Singh");
bw.newLine();
bw.write("Learner...");
bw.close();

}
}