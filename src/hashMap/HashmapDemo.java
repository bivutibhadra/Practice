package hashMap;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {

        //put,get
        HashMap<Integer, String> customer = new HashMap<Integer, String>();

        customer.put(101, "Bivuti");
        customer.put(102, "Hashi");
        customer.put(103, "Nishat");
        customer.put(104, "Trishan");
        customer.put(105, "Nirjon");
        System.out.println(customer.get(103));
    }
}
