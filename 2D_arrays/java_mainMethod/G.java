class G{
    public static void main(String[] args) {
        System.out.println("Length - "+ args.length);
        System.out.println("```````````");
        for(String next:args)
        {
            System.out.println(next);
        }

        System.out.println("``````````");
        System.out.println("Sum : "+ (args[1]+args[1]));   //here the arithmetic operation cannot take place bcz these integers aer treated as a String
    }
}


// Length - 4
// ```````````
// rahul
// 12
// 13
// krish
// ``````````
// Sum : 1212