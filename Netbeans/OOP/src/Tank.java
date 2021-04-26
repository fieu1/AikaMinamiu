/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aikacchii
 */
public class Tank extends Player{
    private int shield;
    
    public Tank(int shield, String name, int attackPower, int health, int range, int defend) {
        this.shield = shield;
        super.name = name;
        super.health = health;
        super.attackPower = attackPower;
        super.range = range;
        super.defend = defend;
    }
    
    @Override
    public int healed(int increase) {
       return health+increase;
    }

    @Override
    public int attack() {
        if(range>=50){
            return 0;
        } else if(range<50){
            return attackPower;
        }
        
        return 0;
    }
    
    @Override
    public int attacked(int attack) {
        return defend= defend + shield - attack;
    }
}
