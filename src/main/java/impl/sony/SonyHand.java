package impl.sony;

import interfaces.Hand;

public class SonyHand implements Hand {

    public void takeSomeThing(){
        System.out.println("Catched from Sony!!");
    }

    public void attack() {
        System.out.println("fire in the hall!!!");
    }
}
