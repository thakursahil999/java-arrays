class L {
    public static void main(String[] args) {
        int[] x={45,62,97,23,41,22,81,16};
        int max=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]>max)
              max=x[i];
        }
        System.out.println("The Max value is : " + max);
    }
}

// PS E:\Java\array.java> java L
// The Max value is : 97
