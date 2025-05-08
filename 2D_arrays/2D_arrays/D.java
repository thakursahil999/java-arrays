class D{
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