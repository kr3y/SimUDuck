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
public class YellowDuck extends Duck{
   
    
        public YellowDuck(){
            this.name=("YellowDuck");
        }

    @Override
    public void display() {
        System.out.println(this.name);
    }
        
    
}
