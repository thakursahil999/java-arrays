class Task{
    public static void main(String[] args) {
        int[][][] arr =new int[3][4][2];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    arr[i][j][k]=i*j*k;
                }
            }
        }

        for(int[][] nxt:arr)
        {
            for(int[] next:nxt)
            {
                for(int n:next)
                {
                   
                    System.out.print(n+ " ") ;
                }
                System.out.println();
            }
           System.out.println();
        }
    }
}