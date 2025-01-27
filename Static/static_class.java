
class static_class
{  
    int a,b;
    // Inner Class
    class Www{
        void display(){
            System.out.println("Wwww inner");
        }
    }
    // Outer Class
    static class SWww{
        void show(){
            System.out.println("Wwww Outer");
        }
    }
    public static void main(String args[])
    {
        static_class ob=new static_class();
        Www ob1=ob.new Www();
        static_class.SWww ob2 =new static_class.SWww();
        ob1.display();
        ob2.show();
    }
}