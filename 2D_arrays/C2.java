class C2{
    public static void main(String[] args) {
        int[] x=new int[] {10,20,30,40,50};
        int[] y=new int[x.length];

        for(int i=x.length-1;i>=0;i--)
        {
            y[x.length-1-i]=x[i];
        }
        for(int next:y)
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