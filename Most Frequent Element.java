//Given an array of integers, find the most frequent element in the array. If multiple elements appear a maximum number of times, print any one of them. Return -1 in case there are no elements.

import java.util.*;

public class Source {

 public static int mostFrequentElement(int[] arr) 
 {
    if(arr.length<=0)
        return -1;
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    Map.Entry<Integer,Integer> result = null;
    
    for(int value : arr)
    {
        if(map.containsKey(value))
        {
            map.put(value,map.get(value)+1);
        }
        else
        {
            map.put(value,1);
        }
    }
    for(Map.Entry<Integer,Integer> maxValue : map.entrySet())
		{
			if (result == null || maxValue.getValue().compareTo(result.getValue()) > 0)
			{
				result = maxValue;
			}
		}
    return result.getKey();
 }


 public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    //mostFrequentElement(arr);
    System.out.println(mostFrequentElement(arr));
 }
}