import java.util.Arrays;

class R{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        System.out.println("Original array---");
        for(int n:arr)
        {
            System.out.println(n);
        }

        int[] copy=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            copy[i]=arr[i];
        }

        System.out.println("Copied Array---");
        for(int n:copy)
        {
            System.out.println(n);
        }
        
    }
}