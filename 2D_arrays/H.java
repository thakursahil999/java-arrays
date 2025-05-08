class H{
    public static void main(String[] args) {
        char a='B';
        byte b=34;
        short c=89;
        int d=102;
        
        int[] x={a,b,c,d};  // windenning conversion small values are assign in large container
        for(int nxt:x)
        {
            System.out.println(nxt);
        }
    }
}

// 66
// 34
// 89
// 102