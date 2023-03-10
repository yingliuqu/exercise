package TestInterface;
//多继承
public class MutipleInterface {

}

interface A{
    void testA();
}
interface B{
    void testB();
}
interface C extends A,B{
    void testC();
}

class shixianlei implements C{

    @Override
    public void testA() {

    }

    @Override
    public void testB() {

    }

    @Override
    public void testC() {

    }
}