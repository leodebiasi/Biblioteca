
package fabricadecarros;

import javax.swing.JOptionPane;

public class CorDoVeiculo {

    String CorDoVeiculo() {
      boolean flag = false;
      do{
        String CorVeiculo = JOptionPane.showInputDialog("INFORME A COR DO AUTOMOVEL: \n"
                                                        + "1 - AZUL    \n"
                                                        + "2 - VERMELHO\n"
                                                        + "3 - AMARELO \n"
                                                        + "4 - PRETO   \n"
                                                        + "5 - BRANCO    ");
        int NumeroDaCor = Integer.parseInt(CorVeiculo);
  
        if (NumeroDaCor >= 1 && NumeroDaCor <= 5) {
            switch (NumeroDaCor) {
                case 1:
                    return ("AZUL");
                case 2:
                    return ("VERMELHO");
                case 3:
                    return ("AMARELO");
                case 4:
                    return ("PRETO");    
                case 5:
                    return ("BRANCO");
                    
            }
        flag = true;
        }
      } while (flag == false);
        return null;
    }      
}
     