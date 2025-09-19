/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogodados_lucas_sara;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Cliente
 */
public class JogoDados_Lucas_Sara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Jogo de Dados");
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(800, 600);
        janela.setLayout(null);
        
        //botões do player 1
        JButton sortearBtn1 = new JButton("Sortear");
        sortearBtn1.setSize(80, 50);
        sortearBtn1.setLocation(80, 300);
        janela.add(sortearBtn1);
        
        JButton guardarBtn1 = new JButton("Guardar");
        guardarBtn1.setSize(80, 50);
        guardarBtn1.setLocation(80, 400);
        janela.add(guardarBtn1);
        
        //botões do player 2
        JButton sortearBtn2 = new JButton("Sortear");
        sortearBtn2.setSize(80, 50);
        sortearBtn2.setLocation(80, 300);
        janela.add(sortearBtn2);
        
        JButton guardarBtn2 = new JButton("Guardar");
        guardarBtn2.setSize(80, 50);
        guardarBtn2.setLocation(80, 400);
        janela.add(guardarBtn2);
        
    }
    
}
