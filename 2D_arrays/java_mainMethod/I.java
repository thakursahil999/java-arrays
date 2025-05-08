class I{
    public static void main(String[] args) {
        System.out.println("Length - " + args.length);

        for(String next:args)
        {
            System.out.println(next);
        }
    }
}

// Length - 4 
// raj    ---> this is treated as another index value 
// yadav  ---> and this is treated as another index value
// 12
// 2004