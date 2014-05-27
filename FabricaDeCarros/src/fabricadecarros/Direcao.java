
package fabricadecarros;

import javax.swing.JOptionPane;

public class Direcao {

    String DirecaoDoVeiculo() {
      boolean flag = false;
        do {
       String ModeloDirecao = JOptionPane.showInputDialog("MODELO DE DIREÇÃO(1-HIDRAULICA / 2-ELETRICA) :");
       int Direcao = Integer.parseInt(ModeloDirecao);            
        if (Direcao == 1 || Direcao == 2) {
            switch (Direcao) {
                case 1:
                    return ("HIDRÁULICA");
                case 2:
                    return ("ELÉTRICA");
            }
        flag = true;
        }
        }while( flag == false);
        return null;
    }      
}
     