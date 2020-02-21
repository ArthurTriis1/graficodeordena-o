/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import java.awt.Color;

/**
 *
 * @author arthu
 */
public class configBar {
   
        private Color cor;
        private int valor;
        
        
        
        public configBar(int valor, int range) {
           
            this.cor = new Color(50, ((255/range)*valor ), (255 - ((255/range)*valor )));
            this.valor = valor;
        }

        
        
        public Color getCor() {
            return cor;
        }

        public void setCor(Color cor) {
            this.cor = cor;
        }

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }
    
}
