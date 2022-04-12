import java.util.*;
public class Calculator {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter two numbers to perform an operation :  ");
       double n1 = s.nextDouble();
       double n2 = s.nextDouble();
       System.out.println("Enter an arithmetic operation to perform (+ , - , * , / :  ");
       char a = s.next().charAt(0);
       double res;
       switch(a)
       {
       case '+':
       res = n1+n2;
       break;
       case '-':
       res = n1-n2;
       break;
       case '*':
       res = n1*n2;
       break;
       case '/':
       res = n1/n2;
       break;
       default:
       System.out.println("Enter a valid operation...");
       return;
   }
   System.out.println(res);
}
}


          



  