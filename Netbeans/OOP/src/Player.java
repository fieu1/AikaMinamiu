/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aikacchii
 */
public abstract class Player {
    protected String name;
    protected int health;
    protected int range;
    protected int attackPower;
    protected int defend;
    
    public abstract int healed(int increase);
    public abstract int attack();
    public abstract int attacked(int attack);
}
