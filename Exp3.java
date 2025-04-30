class Exp3{
    public static void main(String[] args) {
        LivingBeing x=new BDog();
        Animal y=x;
        
        System.out.println(y);
    }
}

// Exp3.java:4: error: incompatible types: LivingBeing cannot be converted to Animal
//         Animal y=x;
//                  ^
// 1 error