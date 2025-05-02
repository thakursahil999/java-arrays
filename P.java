class P{
    public static void main(String[] args)
    {
        int[] arr={2,56,8,4,9,7,6,3,13};
        int maxEven=arr[1];
        int minOdd=arr[1];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("Even : " + arr[i]);

                if(arr[i]>maxEven)
                {
                    maxEven=arr[i];
                }
            }
            else
            {
               
                System.out.println("Odd : " + arr[i]);

                if(arr[i]<minOdd)
                {
                    minOdd=arr[i];
                }
            }
        }

        System.out.println("The Largest Even Number : " + maxEven);
        System.out.println("---");
        System.out.println("The Smallest Odd value : " + minOdd);
    }
}

// Even : 56
// Even : 8
// Even : 4
// Odd : 9
// Odd : 7
// Even : 6
// Odd : 3
// Odd : 13
// The Largest Even Number : 56
// ---
// The Smallest Odd value : 3