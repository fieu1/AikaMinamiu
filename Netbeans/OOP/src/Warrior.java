/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aikacchii
 */
public class Warrior extends Player{
    private int attackSpeed;
    
    public Warrior(int attackSpeed, String name, int attackPower, int health, int range, int defend) {
        this.attackSpeed = attackSpeed;
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
    
    public int fullComboAttack() {
        return attackPower*attackSpeed;
    }
    
    @Override
    public int attacked(int attack) {
        return defend-=attack;
    }
}
