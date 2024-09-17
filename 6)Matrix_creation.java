import java.util.*;
class main
{
    //2d array 
    public static void main(String[] args)
    {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    System.out.println("-----------");
    int[][] mat=new int[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            mat[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
             System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
}
}
