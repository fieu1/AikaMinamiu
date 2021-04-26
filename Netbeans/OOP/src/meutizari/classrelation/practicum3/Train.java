/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meutizari.classrelation.practicum3;

/**
 *
 * @author Aikacchii
 */
public class Train {
    private String name;
    private String classOfTrain;
    private Employee machinist;
    private Employee assistent;

    public Train(String name, String classOfTrain, Employee machinist, Employee assistent) {
        this.name = name;
        this.classOfTrain = classOfTrain;
        this.machinist = machinist;
        this.assistent = assistent;
    }
    public Train(String name, String classOfTrain, Employee machinist) {
        this.name = name;
        this.classOfTrain = classOfTrain;
        this.machinist = machinist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMachinist(Employee machinist) {
        this.machinist = machinist;
    }

    public void setClassOfTrain(String classOfTrain) {
        this.classOfTrain = classOfTrain;
    }

    public void setAssistent(Employee assistent) {
        this.assistent = assistent;
    }

    public String getName() {
        return name;
    }

    public String getClassOfTrain() {
        return classOfTrain;
    }

    public Employee getMachinist() {
        return machinist;
    }

    public Employee getAssistent() {
        return assistent;
    }
    
    public String info(){
        String info = "";
        info += "Name : " + this.name + "\n";
        info += "Class : " + this.classOfTrain + "\n";
        info += "Machinist : " + "\n"+ this.machinist.info() + "\n";
        info += "Assistant : " + "\n"+ this.assistent.info() + "\n";
        return info;
    }
}
