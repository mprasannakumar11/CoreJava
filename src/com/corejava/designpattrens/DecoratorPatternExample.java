package com.corejava.designpattrens;

// 1. Component Interface:
interface Beverage {
    String getDescription();

    double getCost();
}

class SimpleCoffee implements Beverage {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}

// 2. Concrete Component Class:
abstract class BeverageDecorator implements Beverage {
    protected Beverage decoratedBeverage;

    public BeverageDecorator(Beverage beverage) {
        this.decoratedBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedBeverage.getCost();
    }
}

// 3. Decorator Class:
class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decoratedBeverage.getCost() + 1.5;
    }
}
// 4. Concrete Decorator Classes:
class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return decoratedBeverage.getCost() + 0.5;
    }
}

// 5. Client Code:
public class DecoratorPatternExample {
    public static void main(String[] args) {
        Beverage beverage = new SimpleCoffee();
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        beverage = new MilkDecorator(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        beverage = new SugarDecorator(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        beverage = new MilkDecorator(beverage); // Adding another milk
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());
    }
}

