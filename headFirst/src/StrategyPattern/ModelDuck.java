package StrategyPattern;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quake();
    }

    public void disply(){
        System.out.println("I'm a model duck");
    }
}
