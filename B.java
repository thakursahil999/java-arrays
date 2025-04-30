class B{
    public static void main(String[] args) {
        int[] x=new int[3];
        x[0]=10;
        x[1]=20;
        x[2]=30;
        for(int i=0;i<x.length;i++)
        {
            System.out.println("The Value at index "+i+" is "+x[i]);
        }
    }
}