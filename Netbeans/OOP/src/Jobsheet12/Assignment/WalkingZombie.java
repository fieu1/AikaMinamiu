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
public class WalkingZombie extends zombie{


    public WalkingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    public void heal() {
        super.heal(20);
    }

    @Override
    public void destroyed() {
        health -= (health*0.19);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = \n" 
                + super.getZombieInfo() + "\n";
    }
}
