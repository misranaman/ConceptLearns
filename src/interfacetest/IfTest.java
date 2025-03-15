package interfacetest;

public class IfTest extends Xyz implements If1,If2{
    @Override
    public void display() {

    }

    public static void main(String[] args) {
        If1 if1=new IfTest();
        if1.display();

        If2 if2=new IfTest();
        if2.display();
    }
}
