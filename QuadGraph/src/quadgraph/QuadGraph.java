/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadgraph;

import javax.swing.JFrame;

/**
 *
 * @author root
 */
public class QuadGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        draw d =new draw();
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(700,700);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //   jf.add(d);
        
    }
    
}
