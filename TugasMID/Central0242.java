// Nirmala 13020210242
interface A{
    public void aaa();
}
interface B extends A{
 
}
class Central0242 implements B{
    public void aaa(){
        System.out.println("AAA");
    }
    public static void main(String[] args){
        Central0242 obj = new Central0242();
        System.out.println("MAIN");
        obj.aaa();
    }
}