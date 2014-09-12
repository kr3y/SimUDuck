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
public abstract class Duck  {
    
    
    
       protected String name;
        
        
            public void swim(){
                System.out.println(this.name + " Swim!!! ");
            }
            
            public void fly(){
                System.out.println(this.name + " Fly!!! ");
            }
        
            public void quack(){
                System.out.println(this.name + " Quack!!! ");
            }
            
            public abstract void display();
    
    }
    

