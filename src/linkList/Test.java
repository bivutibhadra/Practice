package linkList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> countryName = new LinkedList<String>();

        countryName.add ("bangladesh");
        countryName.add ("india");
        countryName.add ("nepal");
        countryName.add (3,"pakistan");
        countryName.add ("austriala");
        countryName.add ("brizal");
        countryName.addFirst ("vutan");
        countryName.addLast ("dubai");
        countryName.remove ("");
        countryName.removeFirst ();
        countryName.removeLast ();



        for(String contry :countryName){
            System.out.println(contry);
        }
        System.out.println("size linlist : "+countryName.size());


    }
}
