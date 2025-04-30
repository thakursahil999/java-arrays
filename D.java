class D{
    static int[] x;   //array int reference variable contain null value
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(x[0]);   //here we try to access the value from null reference variable
    }
}

// Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "D.x" is null
//         at D.main(D.java:4)