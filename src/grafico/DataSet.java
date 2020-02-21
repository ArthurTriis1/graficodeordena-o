/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;


import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author arthu
 */
public class DataSet extends ArrayList<configBar>{
    
    private int range;
        
  
    
    public DataSet(int min, int max){
        this.range = max;
        for (int i = min; i<=max; i++){
            this.add(new configBar(i, max));
        } 
    }
    
    public void randomize(){
        Collections.shuffle(this);
    }
    
    /**
     *
     * @param i
     * @return
     */


    public int getValue(int i){
        return this.get(i).getValor();
    }
    
    public void setValue(int position, int value){
        this.set(position, new configBar(value, this.range));
    }
    
    public Color getColor(int i){
        return this.get(i).getCor();
    }
    
    public void setColor(int position, Color value){
        this.get(position).setCor(value);
    }
    
}
