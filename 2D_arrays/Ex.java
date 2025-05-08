class Ex{
    public static void main(String[] args) {
        Parent[] arr=new Parent[4];

        arr[0]=new Parent();
        arr[1]=new Child1();
        arr[2]=new Child2();
        arr[3]=new Child3();

        arr[0].show();
       
        Child1[] v=new Child1[1];

        v[0]=new Child1();
        v[0].pro();
      
        
 
    }
}