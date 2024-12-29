import java.util.Scanner;
class Main
{
    public static int solve (int r, int unit, int arr[], int n)
    {
        if (arr == null)
            return -1;
        int res = r * unit;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + arr[i];
            count++;
            if (sum >= res)
                break;
        }
        if (sum < res)
            return 0;
        return count;
    }
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter the number of rats");
        int r = scan.nextInt ();
        System.out.println("enter the units of food each rat shall eat");
        int unit = scan.nextInt ();
        System.out.println("enter the number of houses");
        int n = scan.nextInt ();
        System.out.println("enter the food in each house");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt ();
        System.out.println ("the answer to the problem is : " + solve (r, unit, arr, n));
    }
}