
package javabeginer;
public class LetsTest {
    
    public void getNothing(){
    System.out.println("Nere i wrie java code");
    try{
    System.out.println("Nothing can happen afternreturn!!");
    return;
    }catch(Exception e){
    System.out.println("there is no error!");
    }
    finally{
    System.out.println("we will finally-block execute after return?!!");
    }
    System.out.println("rest of the method...!!");
    }
    public void main(String[]arge){
    LetsTest ob = new LetsTest();
    ob.getNothing();
    System.out.println("in main");
    }
}
