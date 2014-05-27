
package fabricadecarros;

import javax.swing.JOptionPane;

public class QuantidadeDePortas {

    String QuantidadeDePortas() {
      boolean flag = false;
        do {  
        String QuantidadeDePortasVeiculo = JOptionPane.showInputDialog(" INFORME A QUANTIDADE DE PORTAS (2/4): ");
        int NumeroDePortaConvertido = Integer.parseInt(QuantidadeDePortasVeiculo);    
        if (NumeroDePortaConvertido == 2 || NumeroDePortaConvertido == 4) {
            switch (NumeroDePortaConvertido) {
                case 2:
                    return ("2 PORTAS  ");
                    
                case 4:
                    return ("  4 portas");
                    
            }
        flag = true;
        }
        }while( flag == false);
        return null;
    }      
}
     