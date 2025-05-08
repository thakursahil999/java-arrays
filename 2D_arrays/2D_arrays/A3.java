class A3{
    public static void main(String[] args) {
        int[][] x=new int[4][3];

        System.out.println(x[0][0].length);
    }
}

// PS E:\Java\array.java\2D_arrays> javac A3.java
// A3.java:5: error: int cannot be dereferenced
//         System.out.println(x[0][0].length);
//                                   ^
// 1 error