class C6{
    public static void main(String[] args) {
        int[] a=new int[]{10,20,30,40,50};

        int sum=0;
        int avg=0;
        for(int nxt:a)
        {
            sum+=nxt;
        }
        avg=sum/a.length;
        System.out.println("Average: "+avg);
    }
}

// Average: 30