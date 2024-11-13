class Main
{
    public static int binsearch(int ele,int[] arr)
    {
        int low=0;
        int high=arr.length;
        int mid;
        for(int i=low;i<high;i++)
        {
            mid=(low+high)/2;
            if(arr[mid]==ele)
            return mid;
            else if(arr[mid]>ele)
                high=mid-1;
            else if(arr[mid]<ele)
                low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int search=89;
        int[] arr={2,5,8,12,56,70,80,89,90};
        System.out.println("key:"+search+" found at "+binsearch(search,arr));
    }
}
