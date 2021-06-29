package hashList;

import java.util.HashSet;

public class HashList {
    public static void main(String[] args) {
        HashSet<String> fruitsName = new HashSet<String>();

        fruitsName.add("apple");
        fruitsName.add("mango");
        fruitsName.add("banana");
        fruitsName.add("orange");
        fruitsName.add("barry");

        System.out.println(fruitsName);
        System.out.println("size = "+fruitsName.size());

        fruitsName.remove("apple");
        System.out.println(fruitsName);
        System.out.println("size = "+fruitsName.size());


        fruitsName.clear();
        System.out.println(fruitsName);
        System.out.println("size = "+fruitsName.size());


        boolean value = fruitsName.isEmpty();
        System.out.println(value);


    }
}
