import java.util.Scanner;
class S{
    public static void main(String[] args) {
        int[] x=new int[5];

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<x.length;i++)
        {
            System.out.print("Enter the Value at index : "+i+ " ");
            x[i]=sc.nextInt();
        }
        for(int n:x)
        {
            System.out.print(n+" ");
        }


        System.out.println("````````````");
        int mid=x.length/2;
        boolean istrue=true;

        for(int i=0;i<mid;i++)
        {
            if (x[i] != x[x.length - 1 - i]) 
            {
                istrue = false;
                break;
            }
        }
        if(istrue)
        {
            System.out.println("The Given array is palindrome");
        }
        else
        {
            System.out.println("The given Array is not a Palindrome");
        }
    
    }
}