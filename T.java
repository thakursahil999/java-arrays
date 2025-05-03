import java.util.Scanner;
class T{
    public static void main(String[] args) {
        int[] x=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<x.length;i++)
        {
            System.out.print("Enter Value at Index "+i+" : ");
            x[i]=sc.nextInt();
        }

        System.out.println("Your Array -");
        for(int n:x)
        {
            System.out.print(n+" ");
        }
        System.out.println();

        int max=x[1];

        for(int i=1;i<x.length;i++)
        {
            if(x[i]>max)
            {
                max=x[i];
            }
        }
        int newMax=x[1];
        for(int i=0;i<x.length;i++)
        {
            if(x[i]!=max)
            {
                if(newMax<x[i])
                {
                    newMax=x[i];
                }
            }
        }
        System.out.println("The Second Largest Element in the array is : "+ newMax);
    }
}

// Enter Value at Index 0 : 23
// Enter Value at Index 1 : 56
// Enter Value at Index 2 : 99
// Enter Value at Index 3 : 10
// Enter Value at Index 4 : 45
// Your Array -
// 23 56 99 10 45
// The Second Largest Element in the array is : 56