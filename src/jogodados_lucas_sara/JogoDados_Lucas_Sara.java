/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogodados_lucas_sara;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Cliente
 */
public class JogoDados_Lucas_Sara {

    private static int contador = 0;
    private static int parcial = 0;
    private static JLabel valorTxt, parcialTxt1, parcialTxt2;
    
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
        
        //valor dos dados
        valorTxt = new JLabel("0");
        janela.add(valorTxt);
        valorTxt.setSize(60, 40);
        valorTxt.setLocation(400, 400);
        
        //texto do parcial 1
        parcialTxt1 = new JLabel("0");
        janela.add(parcialTxt1);
        parcialTxt1.setSize(60, 40);
        parcialTxt1.setLocation(400, 400);
        
        //ação ocorrida no botão 1
        sortearBtn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Random gerador = new Random();
                int dados = gerador.nextInt(6)+1;
                parcial = parcial + dados;
                valorTxt.setText(dados+"");
                
                switch(dados){
                    case 1:
                        //passar a vez
                    case 6:
                        //passa a vez e zera o parcial
                        parcial = 0;
                }
            }
        
        });
        
    }
    
}
