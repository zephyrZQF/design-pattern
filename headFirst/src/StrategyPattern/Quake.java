package StrategyPattern;

public class Quake implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
