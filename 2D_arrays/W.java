class W{
    public static void main(String[] args) {
       int[] x={};
       int[][] y={};
       int[][][] z={};

       System.out.println(x instanceof int[]);
       System.out.println(y instanceof int[][]);
       System.out.println(z instanceof int[][][]);
    }
}
// PS E:\Java\array.java> java W
// true
// true
// true