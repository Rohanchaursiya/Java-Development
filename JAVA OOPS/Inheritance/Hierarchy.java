class Animal{
    void eat(){
        System.out.println("Animal is eating...");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking...");
    }
}
public class Hierarchy {
    public static void main(String args[]){
        Cat cat=new Cat();
        cat.eat();
        cat.meow();
        
        Dog dog=new Dog();
        dog.eat();
        dog.bark();

    }
}
