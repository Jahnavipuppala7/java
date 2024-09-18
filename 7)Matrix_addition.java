import java.util.*;
class Java
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[][] a={{2,4,3},{3,4,3},{2,5,6}};
        int[][] b={{1,2,2},{1,3,1},{2,8,3}};
        int[][] c=new int[4][4];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int k=0;k<3;k++)
        {
            for(int l=0;l<3;l++)
            {
                System.out.print(c[k][l]+" ");
            }
            System.out.println();
        }
    }
}
