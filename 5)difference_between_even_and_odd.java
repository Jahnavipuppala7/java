import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int n,even=0,odd=0,diff;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
                even=even+arr[i];
            else
            odd=odd+arr[i];
        }
        System.out.println("even sum:"+even);
        System.out.println("odd sum:"+odd);
        if(even>odd)
        diff=even-odd;
        else
        diff=odd-even;
        System.out.println(diff);
    }
}
