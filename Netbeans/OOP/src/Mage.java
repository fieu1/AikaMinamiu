/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aikacchii
 */
public class Mage extends Player {

    private int rangeAttack;

    public Mage(int rangeAttack, String name, int attackPower, int health, int range, int defend) {
        this.rangeAttack = rangeAttack;
        super.name = name;
        super.health = health;
        super.attackPower = attackPower;
        super.range = range;
        super.defend = defend;
    }

    @Override
    public int healed(int increase) {
        return health + increase;
    }

    @Override
    public int attack() {
        return attackPower+rangeAttack;
    }
    

    @Override
    public int attacked(int attack) {
        return defend -= attack;
    }
}
