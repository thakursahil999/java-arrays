class C4{
    public static void main(String[] args) {
        int[] x={10,20,30,40,50};
        int[] y=new int[x.length];

        int i=x.length-1;
        int j=0;
        while(i>=0)
        {
            y[j]=x[i];
            j++;
            i--;
        }
        for(int n:y)
        {
            System.out.println(n+"```");
        }
    }
}

// 50```
// 40```
// 30```
// 20```
// 10`