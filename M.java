class M{
    public static void main(String[] args) {
        int[] x={45,62,97,23,41,2,22,81,16};
        int min=x[1];
        for(int i=1;i<x.length;i++)
        {
            if(x[i]<min)
              min=x[i];
        }
        System.out.println("the min value is : " + min);
    }
}

// the min value is : 2