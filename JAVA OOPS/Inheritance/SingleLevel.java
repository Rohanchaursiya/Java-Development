class A{
    void printA(){
        System.out.println("CLASS A or Parent Class");
    }
}
class B extends A{
    void printB(){
        System.out.println("CLASS B or Child Class");
    }
}

public class SingleLevel{
    public static void main(String args[]){
        B b=new B();
        b.printB();
        b.printA();
    }
}