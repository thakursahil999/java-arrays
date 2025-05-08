class A7{
    public static void main(String[] args) {
        String[][] x=new String[2][2];

        x[0][0]="raju";
        x[0][1]="mohan";
        System.out.println("Length- "+ x[0][0].length());
        System.out.println("Length- "+ x[0][1].length());

        System.out.println("**********");

        System.out.println(x[0][0]);
        System.out.println(x[0][1]);
    }
}

// Length- 4
// Length- 5
// **********
// raju
// mohan