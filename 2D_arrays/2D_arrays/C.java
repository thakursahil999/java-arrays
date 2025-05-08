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
        }
    }
}


// rj1
// rj2
// rj3
// `````````````
// om1
// om2
// `````````````
// krick1
// `````````````