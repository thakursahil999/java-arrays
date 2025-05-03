class V{
    public static void main(String[] args) {
    // Count Frequency of Each Element
    
        int[] x={1,2,2,1,2,4,5};
    
       
        for(int i=0;i<x.length;i++)
        {
            boolean alreadyCounted = false;

           
            for (int j = 0; j < i; j++) {
                if (x[i] == x[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue; 
            }

            int freq=0;
            int a=x[i];
            for(int next:x)
            {
                if(a==next)
                {
                    freq++;
                }
            }
            System.out.println("Frequency of "+x[i]+" : "+freq);
        }
    }
    
}

// Frequency of 1 : 2
// Frequency of 2 : 3
// Frequency of 4 : 1
// Frequency of 5 : 1
    