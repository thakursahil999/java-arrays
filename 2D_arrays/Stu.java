class Stu{
    public static void main(String[] args) {
        Student[] x=new Student[3];
        x[0]=new Student("OM",12);
        x[1]=new Student("Kamal", 10);
        x[2]=new Student("Rakesh", 20);
        // System.out.println(x);
        // System.out.println(x[0]);

        System.out.println(x[0].name+": "+x[0].age);
        System.out.println(x[1].name+": "+x[1].age);
        System.out.println(x[2].name+": "+x[2].age);
    }
}