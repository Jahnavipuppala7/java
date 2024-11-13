import java.util.*;
class Main
{
    public static int linsearch(int search,int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(search==arr[i])
            return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int search=32;
        int[] arr={2,5,1,9,4,56,32};
        System.out.println(search+" at index "+linsearch(search,arr));
        
    }
}
