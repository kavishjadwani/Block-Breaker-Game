/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blockbreakergame;

import javax.swing.JFrame;

/**
 *
 * @author Monika
 */
public class BlockBreakerGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Block Breaker by Kavish ");
        BlockBreakerPanel panel = new BlockBreakerPanel();
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(490,600);
        frame.setResizable(false);
    }
}
