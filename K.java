class K {
    public static void main(String[] args)
    {
        int[] x={45,62,97,23,41,22,81,16};
        int count=0;
        for(int element:x)
        {
            if(element % 2==1)
            {
                System.out.println(element);
                continue;
            }
            count++;
        }
        System.out.println("The Count Of Even Numbers : "+ count);
    }
}

// 45
// 97
// 23
// 41
// 81
// The Count Of Even Numbers : 3