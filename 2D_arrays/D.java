class D{
<<<<<<< HEAD
    static int[] x;   //array int reference variable contain null value
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(x[0]);   //here we try to access the value from null reference variable
    }
}

// Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "D.x" is null
//         at D.main(D.java:4)
=======
    public static void main(String[] args) {
        int[][] x={{10},{11,12},{13,14,15},{16,17,18,19}};

        for(int[] v:x)
        {
            for(int next:v)
            {
                System.out.println(next);
            }
            System.out.println("------------------");
        }
    }
}
// PS E:\Java\array.java\2D_arrays> javac D.java
// PS E:\Java\array.java\2D_arrays> java D
// 10
// ------------------
// 11
// 12
// ------------------
// 13
// 14
// 15
// ------------------
// 16
// 17
// 18
// 19
>>>>>>> 1813b86 (new java files)
