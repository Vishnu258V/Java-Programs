package Abstraction_Interface;

public class interface1 {
    public static void main(String[] args) {
        ImplementationClass ic = new ImplementationClass();
        ic.display();
        ic.show();
        System.out.println(TestInterface.count);
    }
}
interface TestInterface {
    void show();
    void display();
    int count = 10;
}
class ImplementationClass implements TestInterface {



   @Override
    public void show() {
        System.out.println("Show");
    }



   @Override
    public void display() {
        System.out.println("Display");
    }
    
}