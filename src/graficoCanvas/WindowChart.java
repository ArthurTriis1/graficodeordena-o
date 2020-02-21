/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficoCanvas;


import java.awt.*; 
import javax.swing.*;

class WindowChart extends JFrame{
  
    JPanel panel;
  JLabel label;

  // constructor
  WindowChart( String title )
  {
    super( title );                      // invoke the JFrame constructor
    this.setPreferredSize(new Dimension(300, 300));
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    
    setLayout( new FlowLayout() );       // set the layout manager
    JPanel pane = new JPanel();
    add(pane);
    label = new JLabel("Hello Swing!");  // construct a JLabel
    pane.add( label );                        // add the label to the JFrame
    
    pack();
  }
}