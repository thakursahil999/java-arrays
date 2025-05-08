class H3{
    public static void main(String[] args) {
        char a='B';
        byte b=34;
        short c=89;
        int d=102;
        long e=899L;
        float f=3.2f;
        double g=88.9;
        
        int[] x={a,b,c,d, (int)e,(int)f,(int)g}; //forcefully assign  the value using typecasting

        for(int next:x)
        {
            System.out.println(next);
        }
    }
}

// 66
// 34
// 89
// 102
// 899
// 3    //here the data is lost 
// 88   //lossy conversion