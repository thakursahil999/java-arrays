class A10{
    public static void main(String[] args) {
        String[][] arr=new String[2][2];

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);


        System.out.println("```````````");
        arr[0][0]="raju";
        arr[0][1]="om";
        arr[1][0]="raj";
        arr[1][1]="krish";

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);

        System.out.println("````````````");
        System.out.println(arr[0][0].length());
        System.out.println(arr[0][1].length());
        System.out.println(arr[1][0].length());
        System.out.println(arr[1][1].length());

    }
}


// null
// null
// null
// null
// ```````````
// raju
// om
// raj
// krish
// ````````````
// 4
// 2
// 3
// 5