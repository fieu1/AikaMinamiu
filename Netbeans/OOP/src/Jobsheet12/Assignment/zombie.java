/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet12.Assignment;

/**
 *
 * @author Aikacchii
 */
public class zombie implements Destroyable{
    protected int health;
    protected int level;
    
    public void heal(int incr){
        int increment = incr;
        float percent = increment / 100;
        
        switch (level){
            case 1 :
                health += (health*percent);
                break;
            case 2 :
                health += (health*(percent+0.1));
                break;
            case 3 :
                health += (health*(percent+0.1));
                break;
        }
    }

    @Override
    public void destroyed() {
       
    }
    
    
    public String getZombieInfo(){
        return "Health = " + health + "\nLevel = " + level;
    }
}
