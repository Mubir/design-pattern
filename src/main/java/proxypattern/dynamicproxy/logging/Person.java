package proxypattern.dynamicproxy;

public class Person implements  Human{
    @Override
    public void walk() {
        System.out.println("˚˚˚˚˚˚˚˚˚˚˚ walking ˚˚˚˚˚˚˚˚˚˚˚");
    }

    @Override
    public void talk() {
        System.out.println("˚˚˚˚˚˚˚˚˚˚˚ talking ˚˚˚˚˚˚˚˚˚˚˚");
    }
}
