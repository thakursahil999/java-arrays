class Exp2{
    public static void main(String[] args) {
        Animal x=new LivingBeing();
        Animal y=x;

        System.out.println(y);
    }
}

// Exp2.java:3: error: incompatible types: LivingBeing cannot be converted to Animal
//         Animal x=new LivingBeing();
//                  ^
// 1 error