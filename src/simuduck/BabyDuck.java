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
public class BabyDuck extends Duck{
    
    public BabyDuck(){
        this.name=("PedNoi");
    }

    @Override
    public void display() {
        System.out.println(this.name);
    }

    @Override
    public void quack() {
        System.out.println(this.name + " squeak ");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " cannot fly ");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " cannot swim ");
    }
    
    
    
}
