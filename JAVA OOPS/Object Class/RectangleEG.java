class Rectangle{
    int length;
    int height;
    void Insert(int x,int y){
        length=x;
        height=y;
    }
    int Area;
    void CalculateArea(){
        Area=length*height;
    }
    void Dispaly(){
        System.out.println("Area of a Rectangle whose length "+length+" and height "+height+" is :"+Area);
    }
}
public class RectangleEG {
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        r1.Insert(5,10);
        r1.CalculateArea();
        r1.Dispaly();
    }
    
}
