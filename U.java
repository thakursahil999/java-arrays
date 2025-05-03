class U{
    public static void main(String[] args) {
        int[] x={1,3,1,2,5,5,2,3,1,3,1,2,4};
        int[] y=new int[x.length];
    
        int yIndex=0;
        for(int i=0;i<x.length;i++)
        {
            boolean isnotdupli=true;
            for(int j=0;j<yIndex;j++)
           {
            if(x[i]==y[j])
            {
                isnotdupli=false;
            }
           }
           if(isnotdupli)
           {
            y[yIndex]=x[i];
            yIndex++;
           }

        }
        for(int i=0;i<yIndex;i++)
        {
            System.out.println(y[i]);
        }

    }

}


// 1
// 3
// 2
// 5
// 4