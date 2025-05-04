class E{
    public static void main(String[] args) {
        int[][][] x=new int[2][][];
        System.out.println(x[0]);
        System.out.println(x[1]);
        x[0]=new int[3][];
        x[1]=new int[2][];
        System.out.println(x[0]);
        System.out.println(x[1]);

        
        x[0][0]=new int[2];
        x[0][1]=new int[1];
        x[0][2]=new int[2];

        x[1][0]=new int[1];
        x[1][1]=new int[2];

        System.out.println(x[0][0]);
        System.out.println(x[0][1]);

        x[0][0][0]=1;
        x[0][0][1]=2;

        x[0][1][0]=3;
        
        x[0][2][0]=4;
        x[0][2][1]=5;

        x[1][0][0]=6;

        x[1][1][0]=7;
        x[1][1][1]=8;

        for(int[][] n:x)
        {
            for(int[] nx:n)
            {
                for(int nxt:nx)
                {
                    System.out.print(nxt+" ");
                }
                System.out.println("**********");
            }
        }

    }
}

// null
// null
// [[I@7ad041f3
// [[I@251a69d7
// [I@7344699f
// [I@6b95977
// 1 2 **********
// 3 **********
// 4 5 **********
// 6 **********
// 7 8 **********