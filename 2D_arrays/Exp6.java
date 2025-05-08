class Exp6 {
    public static void main(String[] args) {
        Animal x=new Cat();
        Dog y=(Dog)x;
        System.out.println(y);
    }   
}

// Exception in thread "main" java.lang.ClassCastException: class Cat cannot be cast to class Dog (Cat and Dog are in unnamed module of loader 'app')
//         at Exp6.main(Exp6.java:4)
// PS E:\Java\array.java> 