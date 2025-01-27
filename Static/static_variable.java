class static_variable{
    int a,b;
    static int c;
    void show()
    {
        System.out.print("Show");
    }
    public static void main(String args[]){
        static_variable ob= new static_variable();
        ob.a=10;
        ob.b=10;
        c=100;
        System.out.print(ob.a);
        System.out.print(ob.b);
        System.out.print(c);
        ob.show();
    }
}