import java.util.*;

public class Stacks{
public static void main(String args[]){
Stack<String> pages = new Stack<>();
pages.push("Home");
pages.push("Products");
pages.push("Cart");
System.out.println(pages);
System.out.println(pages.peek());

pages.pop();
System.out.println(pages);
}
}