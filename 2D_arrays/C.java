<<<<<<< HEAD
class c{
    public static void main(String[] args) {
        int[] x={10,20,30,40,50};

        for(int i=x.length-1;i>=0;i--)
        {
            System.out.println(x[i]);
=======
class C{
    public static void main(String[] args) {
        String[][] x=new String[][]{{"rj1","rj2","rj3"},{"om1","om2"},{"krick1"}};

        for(String[] nx:x)
        {
            for(String next:nx)
            {
                System.out.println(next);
            }
            System.out.println("`````````````");
>>>>>>> 1813b86 (new java files)
        }
    }
}

<<<<<<< HEAD
// 50
// 40
// 30
// 20
// 10
=======

// rj1
// rj2
// rj3
// `````````````
// om1
// om2
// `````````````
// krick1
// `````````````
>>>>>>> 1813b86 (new java files)
