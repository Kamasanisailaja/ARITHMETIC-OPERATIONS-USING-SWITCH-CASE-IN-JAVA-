//calculator using switch case

import java.util.Scanner;
class Switch
{
    public static void main(String args[])
    {
        double a,b;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first value:");
        a = in.nextDouble();
        System.out.println("Enter the second value:");
        b = in.nextDouble();
        char ch;
        System.out.println("Enter the value :");
        ch = in.next().charAt(0);
        in.close();
        double output;
        
        switch(ch)
        {
            case '+':
                {
                    output = a+b;
                    System.out.println("Addition of a and b is "+output);
                    break;
                }
            case '-':
                {
                    output = a-b;
                    System.out.println("Sub of a and b is "+output);
                    break;
                }
            case '*':
                {
                    output = a*b;
                    System.out.println("Mul of a and b is "+output);
                    break;
                }
            case '/':
                {
                    output = a/b;
                    System.out.println("Div of a and b is "+output);
                    break;
                }
            case '%':
                {
                    output = a%b;
                    System.out.println("Mod of a and b is "+output);
                    break;
                }
            default:
                {
                    System.out.println("Invalid!!...");
                    return;
                }
        }  

    }
}
               
