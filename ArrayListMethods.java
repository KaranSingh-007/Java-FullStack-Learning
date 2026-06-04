import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("After add(): " + list);

        list.add(1, "JavaScript");
        System.out.println("After add(index,obj): " + list);

        System.out.println("Element at index 2: " + list.get(2));

        list.set(0, "Spring Boot");
        System.out.println("After set(): " + list);

        System.out.println("Contains Python? " + list.contains("Python"));
        System.out.println("Contains React? " + list.contains("React"));

        System.out.println("Size of list: " + list.size());

        System.out.println("Index of Python: " + list.indexOf("Python"));

        list.remove("Python");
        System.out.println("After remove(): " + list);

        System.out.println("Is list empty? " + list.isEmpty());

        list.clear();
        System.out.println("After clear(): " + list);

        System.out.println("Is list empty now? " + list.isEmpty());
    }
}