package fabricadecarros;

import javax.swing.JOptionPane;

public class Potencia {

    double PotenciaDoMotor() {
      boolean Flag = false;
      do{
       String POtenciaMotorInformada = JOptionPane.showInputDialog("INFORME A POTENCIA (1.0 - 2.2) :");
       double Potencia = Double.parseDouble(POtenciaMotorInformada);
        if (Potencia >= 1.0 && Potencia <= 2.2) {
            Flag = true;
            return Potencia;           
        }
       } while (Flag == false);
        return 0;

    }
}
