class E{
    public static void main(String[] args) {
        int[] x=new int[] {0,5,3};

        System.out.println(x[3]); // we try to access the index the which is not present
    }
}

// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//         at E.main(E.java:5)