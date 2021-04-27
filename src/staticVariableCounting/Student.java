package staticVariableCounting;

public class Student {
     static  int count = 0;       //static er jonno value gula alada alada count hoscha
      Student(){

          count ++ ;
      }
       void studentCount(){
           System.out.println(" Total Stduent = "+count);


       }
}
