/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simuduck;

/**
 *
 * @author Administrator
 */
public class SimUDuck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            RubberDuck rubberDuck = new RubberDuck();
            rubberDuck.swim();
            rubberDuck.fly();
            rubberDuck.quack();
            System.out.println("");
            YellowDuck yellowDuck = new YellowDuck();
            yellowDuck.swim();
            yellowDuck.fly();
            yellowDuck.quack();
            System.out.println("");
            BabyDuck babyDuck = new BabyDuck();
            babyDuck.swim();
            babyDuck.fly();
            babyDuck.quack();
    }
    
    
}
