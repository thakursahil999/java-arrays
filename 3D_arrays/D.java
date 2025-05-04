import java.util.Scanner;
class D{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][][] x=new int[3][2][2];

        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                for(int k=0;k<x[i][j].length;k++)
                {
                    System.out.print("Enter : ");
                    x[i][j][k]=sc.nextInt();
                }
                System.out.println("------------------");
            }
        }

        for(int[][] next:x)
        {
            for(int[] next1:next)
            {
                for(int next2:next1)
                {
                    System.out.print(next2 +" " );
                }
                System.out.println("----------");
            }
        }
    }
}
// Enter : 1
// Enter : 2
// ------------------
// Enter : 3
// Enter : 4
// ------------------
// Enter : 5
// Enter : 6
// ------------------
// Enter : 7
// Enter : 8
// ------------------
// Enter : 9
// Enter : 10
// ------------------
// Enter : 11
// Enter : 12
// ------------------
// 1 2 ----------
// 3 4 ----------
// 5 6 ----------
// 7 8 ----------
// 9 10 ----------
// 11 12 ----------