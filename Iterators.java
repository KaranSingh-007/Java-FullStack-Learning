import java.util.*;
import java.lang.*;
public class Iterators{
public static void main(String args[]){
Vector<String> list = new Vector<>();
list.add("Java");
list.add("Python");
list.add("C++");
list.add("C");

Iterator<String> itr = list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());

}
}
}