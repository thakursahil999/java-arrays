import java.util.Scanner;
class Parent{
  void show(){
    
    String[] x=new String[3];
   Scanner sc=new Scanner(System.in);

   for(int i=0;i<x.length;i++)
   {
    System.out.print("Enter Name : ");
    String name=sc.nextLine();
    x[i]=name;
   }

   for(String next:x)
   {
    System.out.println(next);
   }
  }
}