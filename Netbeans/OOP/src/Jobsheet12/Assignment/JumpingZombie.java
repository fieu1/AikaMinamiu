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
public class JumpingZombie extends zombie{

    public JumpingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    
    public void heal() {
        super.heal(30); 
    }

    @Override
    public void destroyed() {
        health -= (health*0.095);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data = \n"
                + super.getZombieInfo() + "\n"; 
    }
}
