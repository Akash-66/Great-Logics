import java.util.Scanner;
class Fibonacci
 {
    static int fib(int n) 
    {
        if(n<3)
            return n;
        int[] arr = new int[n];
        int result = 0;
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for(int i=3;i<n;i++)
        {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
            result = arr[i];
        }
        /*for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");*/
        return result;
    }
  
    public static void main(String args[])
    {
    	Scanner scan = new Scanner(System.in);
    	// Enter the number n
        int n = scan.nextInt();
        System.out.println(fib(n));
    	scan.close();
    }
}