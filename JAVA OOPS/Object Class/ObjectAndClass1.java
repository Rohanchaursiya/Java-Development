/* Initialization through reference */
class Student{
    int id;
    String name;
    void Insert(int id,String name){
        this.id=id;
        this.name=name;
    }
    void Dispaly(){
        System.out.println(id+" "+name);
    }
}
public class ObjectAndClass1 {
    public static void main(String args[]){
        Student s1=new Student();
        // s1.id=6126;
        // s1.name="Rohan";
        s1.Insert(6126,"Rohan");
        s1.Dispaly();
        //System.out.println(s1.id+" "+s1.name);
        Student s2=new Student();
        s2.id=6127;
        s2.name="Teja";
        System.out.println(s2.id+" "+s2.name);
    }
    
}
