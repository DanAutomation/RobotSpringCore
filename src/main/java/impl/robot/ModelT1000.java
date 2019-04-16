package impl.robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;

public class ModelT1000 implements Robot {

    private Hand hand;
    private Leg leg;
    private Head head;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    @Override
    public void fight() {
        hand.attack();
        leg.hit();
        head.think();
    }

    @Override
    public void protect() {
//        hand.takeSomeThing();
//        leg.hit();
//        head.think();
        System.out.println("T1000 is protecting");
    }
}
