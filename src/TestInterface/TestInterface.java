package TestInterface;

public class TestInterface {
    public static void main(String[] args) {
        Volant i = new Angle();
        Honest j = new GoodMan();
        Honest k = new Angle();
    }
}


/**
 * 飞行接口
 */
interface Volant{
    int FLY_HEIGHT = 1000;
    void fly();
}

//善良接口
interface Honest{
    void Help();
}

//天使
class Angle implements Volant,Honest{

    @Override
    public void fly() {
        System.out.println("我会飞");
    }

    @Override
    public void Help() {
        System.out.println("我善良");
    }
}
//好男人
class GoodMan implements Honest{

    @Override
    public void Help() {
        System.out.println("我善良");
    }
}