package array;

public class Array {
    public static void main(String[] args) {
        int[] Number;                                                /**Arry declear*/
        Number = new int[10];                                        /**Arry creat*/
        int[] Number2 = new int[8];                                  //ata ak line aa kora jai....

        Number[0] = 10;
        Number[1] = 5;
        Number[2] = 12;
        Number[3] = 15;                                               //Arry te value store kora
        Number[4] = 20;
        Number[5] = 14;
        Number[6] = 5;

        Number2[0] = 55;
        Number2[1] = 45;
        Number2[2] = 15;
        Number2[3] = 15;                                 //Arry te value store kora
        Number2[4] = 35;

        int len = Number.length;             //Array leangth koto seta print korar jonno ai function ta use kora hoyisa..
        int len2 = Number2.length;
        System.out.println("Number1 of Arry= "+len);
        System.out.println("Number2 of Arry= "+len2);



        int sum = Number[0]+Number[1]+Number[2]+Number[3]+Number[4]+Number[5]+Number[6]+Number2[0]+Number2[1]+Number2[2]+Number2[3]+Number2[4];
        System.out.println("Answer= of array " +sum);

    }
}
