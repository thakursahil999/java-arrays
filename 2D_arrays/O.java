class O{
    public static void main(String[] args) {
        int[] arr={2,56,8,4,9,7,6,3,13};
        int max=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("Even : " + arr[i]);
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
        }
        System.out.println("``````````");
        System.out.println("The Largest Even Number is : "+ max);
    }
}

// Even : 2
// Even : 56
// Even : 8
// Even : 4
// Even : 6
// ``````````
// The Largest Even Number is : 56