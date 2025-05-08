class D1{
    static int[] x;
    public static void main(String[] args) {
        
        System.out.println(x.length);
    }
}


// Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "D1.x" is null
//         at D1.main(D1.java:5)