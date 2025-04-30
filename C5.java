class C5{
    public static void main(String[] args) {
        int[] a=new int[]{10,20,30,40,50};
        int[] x=new int[a.length];

        for(int i=a.length-1, j=0;i>=0;i--,j++)
        {
            x[j]=a[i];
        }
        for(int next:x)
        {
            System.out.println(next);
        }
    }
}


// 50
// 40
// 30
// 20
// 10