import java.util.Scanner;
public class Validstring
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter string which has '* ' '#' ");
        String s =scan.next();
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== '*' )
                a++;
            else if (s.charAt(i) == '#')
                b++;
        }System.out.print(" the difference between no of '*' and no of '#' is :");
        System.out.println(a-b);
    }


}
