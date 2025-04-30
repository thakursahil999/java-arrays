class Exp5{
 
    public static void main(String[] args) {
        LivingBeing x= new LivingBeing();
        Animal y=(Animal)x;
        
        System.out.println(y);
    }
}

// Exception in thread "main" java.lang.ClassCastException: class LivingBeing cannot be cast to class Animal (LivingBeing and Animal are in unnamed module of loader 'app')
//         at Exp5.main(Exp5.java:5)
// PS E:\Java\array.java> 