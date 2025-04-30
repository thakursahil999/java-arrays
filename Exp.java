class Exp{
    public static void main(String[] args) {
        Animal[] x=new Animal[5];

        x[0]=new Animal();
        x[1]=new Cat();
        x[2]=new Cow();
        x[3]=new Dog();
        x[4]=new BDog();

        for(Animal var:x)
        System.out.println(var);
    }
}

// Animal@58644d46  //gives the reference variable of the class object
// Cat@14dad5dc
// Cow@18b4aac2
// Dog@764c12b6
// BDog@c387f44