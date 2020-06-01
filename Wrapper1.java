/*Java program to convert primitive into objects Autoboxing 
 int to Integer */
public class Wrapper1{  
    public static void main(String args[]){  
    //Co 
    int a=20;  
    Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
    Integer j=a;//autoboxing, implicit conversion
      
    System.out.println(a+" "+i+" "+j);  
    }
}