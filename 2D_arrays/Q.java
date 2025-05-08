class Q{
    public static void main(String[] args)
    {
        int[] x={1,2,3,4,5,6};
        int mid=x.length/2;
        int temp;

        for(int i=0;i<mid;i++)
        {
            temp=x[x.length-1-i];
            x[x.length-1-i]=x[i];
            x[i]=temp;
        }

        for(int element:x)
        {
            System.out.print(element +" ");
        }
    }
}

// 6 5 4 3 2 1 