//calc
import java.util.*;
class Main {
    public static void main(String[] ars) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Simple calculator");
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt(); int result=0;
        System.out.println("Choose operation: +, -, *, /");
        char operation = sc.next().charAt(0);
         switch (operation) {
    case '+':
    result=a+b;
    break;
    case '-':
    result=a-b;
    break;
    case '*':
    result= a*b;
    break;
    case '/':
    if (b!= 0) {
    result = a/b;
    } else {
    System.out.println("cant divide");
                    result = a/b;
                    break;
    }}
    System.out.println(result);

    }
}
    
--------------------------------------------------------------------------------------------------------------------------------------------
