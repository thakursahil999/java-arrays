class N{
    public static void main(String[] args) {
        char[] x={'M','A','N','O','J'};
        System.out.println(x);  //the array of character reference variable cannot give reference value it gives the arrayy in string format

        System.out.println("-------------");
        for(char next:x)
           System.out.println(next);
    }
}


// MANOJ
// -------------
// M
// A
// N
// O
// J