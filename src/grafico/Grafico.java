/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import java.awt.Color;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author arthu
 */
public class Grafico {

    /**
     * @param args the command line arguments
     */
    //Criar o data set
    public CategoryDataset createDataSet(DataSet dados){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        int index = 0;
        for(int i = 0; i < dados.size(); i++){
            dataSet.addValue(dados.getValue(i), i+"" , "");
            
            index++;
        }
        index = 0;
        return dataSet;
    }
    
    public JFreeChart createBarChart(CategoryDataset dataset){
        JFreeChart graficoBarras = ChartFactory
                .createBarChart("Numeros Aleatorios", 
                 "", 
                 "Valores", 
                 dataset, 
                 PlotOrientation.VERTICAL, 
                 false, false, false);
        return graficoBarras;
    }
    
    public ChartPanel criarGrafico(DataSet dados){
        CategoryDataset dataSet = this.createDataSet(dados);
        
        JFreeChart grafico = this.createBarChart(dataSet);
        
        ChartPanel painelGrafico = new ChartPanel(grafico);
        
        painelGrafico.setPreferredSize(new Dimension(400, 400));
        
        
        
        
        //configurar cor:
            CategoryPlot plot = grafico.getCategoryPlot();
            BarRenderer renderer = (BarRenderer) plot.getRenderer();

            // set the color (r,g,b) or (r,g,b,a)
            //Color color = new Color(79, 129, 189);
            for (int i=0; i < dados.size(); i++){
                renderer.setSeriesPaint(i, dados.getColor(i));
            }
            
        
        return painelGrafico;
    }
    

    
}
