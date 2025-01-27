class static_block{
    int a,b;
    static {
        System.out.println("Class");
    }
    void show()
    {
        System.out.println("Show");
    }
    public static void main(String args[]){
        static_block ob= new static_block();
        ob.show();
    }
}