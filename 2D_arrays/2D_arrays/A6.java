class A6{
    public static void main(String[] args) {
        String[][] x=new String[2][2];

        System.out.println(x[0][0].length());
        System.out.println(x[0][1].length());
    }
}

// PS E:\Java\array.java\2D_arrays> java A6
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>[0][0]" is null
//         at A6.main(A6.java:5)