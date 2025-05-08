class C1{
    public static void main(String[] args) {
        
        int[] z=new int[] {10,20,30,40,50};
        int[] y=new int[z.length];

        for(int i=0;i<z.length;i++)
        {
            y[i]=z[i];
        }
        for(int var:y)
        {
            System.out.println(var);
        }
    }
}


// 10
// 20
// 30
// 40
// 50