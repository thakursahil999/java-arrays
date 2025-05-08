class A5{
    public static void main(String[] args) {
        String[][] x=new String[2][2];

        System.out.println(x[0][0].length);
        System.out.println(x[0][1].length);
        System.out.println(x[1][0].length);
        System.out.println(x[1][1].length);
    }
}

// System.out.println(x[0][0].length);
// ^
// symbol:   variable length
// location: class String
// A5.java:6: error: cannot find symbol
// System.out.println(x[0][1].length);
// ^
// symbol:   variable length
// location: class String
// A5.java:7: error: cannot find symbol
// System.out.println(x[1][0].length);
// ^
// symbol:   variable length
// location: class String
// A5.java:8: error: cannot find symbol
// System.out.println(x[1][1].length);
// ^
// symbol:   variable length
// location: class String
// 4 errors
// PS E:\Java\array.java\2D_arrays> 