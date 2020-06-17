//Write a program to reverse the elements of a given 2*2 array.
//Four integer numbers needs to be passed as Command Line arguments.

public class TestA13
{
    public static void main(String[] args)
    {
        int a[][] = new int[2][2];
        int i,j,k = 0;
        for( i=0; i<2; ++i)
        {
            for( j=0; j<2; ++j)
            {
                a[i][j]=Integer.parseInt(args[k]);
                k++;
            }
        }
        System.out.println("The given array is :");
        for( i=0; i<2; ++i)
        {
            for(j=0; j<2; ++j)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("The reverse of the array is :");
        for( i=1; i>=0; i--)
        {
            for(j=1; j>=0; j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}