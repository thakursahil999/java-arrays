class H{
    public static void main(String[] args) {
        System.out.println("Length - "+ args.length);

        System.out.println("``````");

        for(int i=0;i<args.length;i++) //print using classic for loop
        {
            System.out.println(args[i]);
        }
        System.out.println("``````````");

        int n1=Integer.parseInt(args[0]);  //here we converth the string to int using parsing
        int n2=Integer.parseInt(args[1]);  //^
        System.out.println("the Sum is : " + (n1+n2));
    }
}

// PS E:\Java\array.java\java_mainMethod> javac H.java
// PS E:\Java\array.java\java_mainMethod> java H 12 5 rahul krish vishal
// Length - 5
// ``````
// 12
// 5
// rahul
// krish
// vishal
// ``````````
// the Sum is : 17