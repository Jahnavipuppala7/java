import java.util.*;
import java.io.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String c=sc.next();
        switch(c)
        {
            case "+":
                System.out.println("Addition is:"+(a+b));
                break;
            case "-":
                System.out.println("Subtraction is:"+(a-b));
                break;
            case "*":
                System.out.println("Multiplication is:"+(a*b));
                break;
            case "/":
                System.out.println("Division is:"+(a/b));
                break;
            case "%":
                System.out.println("modulo is:"+(a%b));
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
