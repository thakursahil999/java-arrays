import java.io.Console;
class H{
    public static void main(String[] args) {
        Console x=System.console();

        String[][][] arr=new String[3][2][3];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                   arr[i][j][k]=x.readLine();
                }
                System.out.println();
            }
            System.out.println("-------------");
        }

        System.out.println("`````````````````````````````````````````````````");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                   System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println("-------------");
        }
    }
}

// r1
// r2
// r

// v1
// v2
// v

// -------------
// k1
// k2
// k

// l1
// l2
// l

// -------------
// q
// q2
// q1

// t1
// t2
// t

// -------------
// `````````````````````````````````````````````````
// r1 r2 r
// v1 v2 v
// -------------
// k1 k2 k
// l1 l2 l
// -------------
// q q2 q1
// t1 t2 t
// -------------