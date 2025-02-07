/* Initialization through a constructor */
class Employe{
    int ID;
    String Name;
    double Salary;
    void SetInformation(int id,String name,double salary){
        ID=id;
        Name=name;
        Salary=salary;
    }
    void Display(){
        System.out.println(ID+" "+Name+" "+Salary);
    }
}
public class ObjectAndClass3 {
    public static void main(String args[]){
        Employe e1=new Employe();
        e1.SetInformation(1,"John",50000);
        e1.Display();
    }
    
}
