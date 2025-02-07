interface One{
    void printOne();
}
interface Two {
    void printTwo();
}
interface Three extends One,Two{
    void printThree();
}
class Number implements Three{
    public void printOne(){
        System.out.println("Interface One");
    }
    public void printTwo(){
        System.out.println("Interface Two");
    }
    public void printThree(){
        System.out.println("Interface Three");
    }
}
public class Multiple {
    public static void main(String args[]){
        /*
         * Multiple class does not exist in java due to ambiguity error
         * In java we can achieve multiple inheritance onlythrough Interfaces
        */
        Number num=new Number();
        num.printThree();
        num.printTwo();
        num.printOne();
        
    }
    
}
