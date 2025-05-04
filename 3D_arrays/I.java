class I{
    public static void main(String[] args) {
        
       int[][][] x=
       {
            {
                {1,2,3},{4},{5,6}
            }
            ,{
                {7,8,9},{10}
            }
            ,{
                {11,12,13}
            }
       } ;
     for(int[][] n:x)
     {
        for(int[] nx:n)
        {
            for(int next:nx)
            {
                System.out.print(next+" ");
            }
            System.out.println();
        }
        System.out.println("````````````");
     }

    }
}

// 1 2 3 
// 4
// 5 6
// ````````````
// 7 8 9
// 10
// ````````````
// 11 12 13
// ````````````