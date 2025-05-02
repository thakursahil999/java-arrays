class I{
    public static void main(String[] args)
    {
        int[] a=new byte[2];  //in primitiv datatype the declaration and instantiation type should be same
        int[] b=new short[2];
        int[] c=new char[2];
    }
    
    
}

// I.java:4: error: incompatible types: byte[] cannot be converted to int[]
//         int[] a=new byte[2];
//                 ^
// I.java:5: error: incompatible types: short[] cannot be converted to int[]
//         int[] b=new short[2];
//                 ^
// I.java:6: error: incompatible types: char[] cannot be converted to int[]
//         int[] c=new char[2];
//                 ^
// 3 errors