package org.example.Introduction;

public abstract  class Duck {
    QuackBehavior quackBehavior;
    FlyBehaviour flyBehaviour;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
