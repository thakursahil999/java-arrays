class J{
    public static void main(String[] args) {
        System.out.println("Length - " + args.length);

        for(String next:args)
        {
            System.out.println(next);
        }
    }
}

// *******java J "raj yadav" "krish kulkarni" "yuvi roy"************


// PS E:\Java\array.java\java_mainMethod> javac J.java

// PS E:\Java\array.java\java_mainMethod> java J "raj yadav" "krish kulkarni" "yuvi roy" 

// Length - 3
// raj yadav
// krish kulkarni
// yuvi roy