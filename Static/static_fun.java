class static_fun{
    int a,b;
    static int c;
    static void show()
    {
        System.out.print("New Show");
    }
    public static void main(String args[]){
        static_fun ob= new static_fun();
        ob.a=10;
        ob.b=100;
        c=20;
        System.out.print(ob.a);
        System.out.print(ob.b);
        System.out.print(c);
        show();
    }
}