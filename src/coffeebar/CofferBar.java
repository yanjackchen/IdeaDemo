package coffeebar;

import coffeebar.Seasoning.Chocolate;
import coffeebar.Seasoning.Milk;
import coffeebar.coffer.Decaf;
import coffeebar.coffer.LongBlack;

public class CofferBar {
    public static void main(String[] args) {
        Drink order;
        order = new Decaf();
        System.out.println("order1 price:"+order.cost());
        System.out.println("order1 desc:"+order.getDescription());
        System.out.println("******************");
        order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        System.out.println("order2 price:" + order.cost());
        System.out.println("order2 Desc:"+ order.getDescription());
    }
}
