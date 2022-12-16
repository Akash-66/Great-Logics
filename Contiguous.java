//Check Array of Contiguous Integers
import java.util.*;

class Contiguous {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0)
        {
            System.out.println("false");
            return;
        }
        //array to store the input elements
        int[] array = new int[n];
        HashSet<Integer> hashSet = new HashSet<Integer>();
        //storing the elements to the array
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            hashSet.add(array[i]);
        }
        //System.out.println(hashSet);
        int temp = array[0];
        int count=0;
        while(hashSet.contains(temp)== true)
        {
            count+=1;
            temp-=1;
        }
        //System.out.println(count);
        temp=array[0];
        while(hashSet.contains(temp+1)== true)
        {
            count+=1;
            temp+=1;
        }
        if(count==hashSet.size())
            System.out.println("true");
        else
            System.out.println("false");
    }
}
