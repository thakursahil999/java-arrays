class A12{
   public static void main(String[] args) {
    int[][] x=new int[2][];

    System.out.println(x[0][0]);
   }
}

// Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "<local1>[0]" is null
//         at A12.main(A12.java:5)