class I2 {
    public static void main(String[] args)
    {
        Animal[] x=new Dog[2];

        x[0]=new Dog();
        x[1]=new Cat();

    }
}


// Exception in thread "main" java.lang.ArrayStoreException: Cat
//         at I2.main(I2.java:7)