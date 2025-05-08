class E1{
    public static void main(String[] args) {
        int[] x=new int[] {10,20,3};
        System.out.println(x[-1]);  
    }
}

// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3
//         at E1.main(E1.java:4)