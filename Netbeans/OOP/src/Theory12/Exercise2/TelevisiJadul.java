/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory12.Exercise2;

/**
 *
 * @author Aikacchii
 */
public class TelevisiJadul extends Elektronik{
    private String modelInput;

    public TelevisiJadul() {
        this.modelInput = "DVI";
        super.voltase = 220;
    }

    public String getModelInput() {
        return modelInput;
    }
}
