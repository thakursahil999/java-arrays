class J{
    public static void main(String[] args) {
        int[][][] x=
        {
             {
                 {},{},{}
             }
             ,{
                 {},{}
             }
             ,{
                 {}
             }
        } ;

        // for(int[][] n:x)
        // {
        //     for(int[] nx:n)
        //     {
        //         for(int next:nx)
        //         {
        //             next=1;
        //         }
        //     }
        // }

        for(int[][] n:x)
        {
            for(int[] nx:n)
            {
                for(int next:nx)
                {
                   System.out.println(next);
                }
            }
        }
    }
}