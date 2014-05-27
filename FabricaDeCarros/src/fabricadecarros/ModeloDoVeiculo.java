
package fabricadecarros;

import javax.swing.JOptionPane;

public class ModeloDoVeiculo {

    String ModeloDoVeiculo() {
      boolean flag = false;
        do {
       String ModeloDoVeiculoDesejado = JOptionPane.showInputDialog("INFORME O MODELO : \n"
                                                                    + "1 - PALIO  \n"
                                                                    + "2 - UNO    \n"
                                                                    + "3 - SIENA  \n"
                                                                    + "4 - BRAV0  \n"
                                                                    + "5 - 500    \n"
                                                                    + "6 - IDEA   \n");
       int NumeroDoModelo = Integer.parseInt(ModeloDoVeiculoDesejado);
        if (NumeroDoModelo >= 1 && NumeroDoModelo <= 6) {
            switch (NumeroDoModelo) {
                case 1:
                    return ("PALIO");
                case 2:
                    return ("UNO");
                case 3:
                    return ("SIENA");
                case 4:
                    return ("BRAVO");    
                case 5:
                    return ("500");
                case 6:
                    return ("IDEA");
                    
            }
        flag = true;
        }
        }while( flag == false);
        return null;
    }      
}
     