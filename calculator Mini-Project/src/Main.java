// calculator program with switch case
import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the first number");
        float a = scan.nextFloat();
        System.out.println("enter the second number");
        float b = scan.nextFloat();
        System.out.println(" enter 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division");
        int c = scan.nextInt();

        switch (c)
        {
            case 1:
                System.out.print("the result of addition of first number and second number is :");
                System.out.println(a+b);
                break;
            case 2:
                System.out.print("the result of subtraction of second number from first number is :");
                System.out.println(a-b);
                break;
            case 3:
                System.out.print("the result of multiplication of first number and second number is :");
                System.out.print(a-b);
                break;
            case 4 :
                System.out.print(" the result when first number is divided from second number is :");
                System.out.print(b/a);
                break;
            default:
                System.out.print("invalid input");
        }

    }
}