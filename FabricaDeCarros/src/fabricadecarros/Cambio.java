
package fabricadecarros;

import javax.swing.JOptionPane;

public class Cambio {

    String CambioDoVeiculo() {
      boolean flag = false;
        do { 
       String CambioVeiculo = JOptionPane.showInputDialog("INFORME O CAMBIO (1-AUTOMOATICO | 2-MANUAL) :");
       int Cambio = Integer.parseInt(CambioVeiculo);    
        if (Cambio == 1 || Cambio == 2) {
            switch (Cambio) {
                case 1:
                    return ("AUTOMÁTICO");
                    
                case 2:
                    return ("MANUAL");
                    
            }
        flag = true;
        }
        }while( flag == false);
        return null;
    }      
}
     