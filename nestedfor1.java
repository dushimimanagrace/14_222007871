public class nestedfor1 {//name of class called nestedfor1
 public static void main (String[] args) {//main method
  for (int i = 1; i < 5; i++) {//initialization,condition and incrementation
  System.out.println(" i = " + i); //this line will display value of i after value of j
   for (int j = 1; j <= i; j++) {//initialization,condition and incrementation
   System.out.println(" j = " + j); //this line will display value of j
  }
 }
}}