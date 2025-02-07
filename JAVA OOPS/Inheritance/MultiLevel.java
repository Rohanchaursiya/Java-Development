class GrandParent{
    void Print_GrandParent(){
        System.out.println("GrandParent Class");
    }
}
class Parent extends GrandParent{
    void Print_Parent(){
        super.Print_GrandParent();
        System.out.println("Parent Class extended from GrandParent Class");
    } 
}
class Child extends Parent{
    void Print_Child(){
        super.Print_Parent();
        System.out.println("Child Class extended from Parent Class");
    }
}
public class MultiLevel {
    public static void main(String args[]){
        Child child1=new Child();
        child1.Print_Child();
        child1.Print_Parent();
        child1.Print_GrandParent();

    }
    
}
