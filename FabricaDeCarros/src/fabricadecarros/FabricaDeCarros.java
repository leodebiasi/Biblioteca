package fabricadecarros;

import javax.swing.JOptionPane;

public class FabricaDeCarros {

    public static void main(String[] args) {

        //instanciando as classes
        CorDoVeiculo CorAutomovel     = new CorDoVeiculo();
        QuantidadeDePortas QtdPortas  = new QuantidadeDePortas();
        Potencia PotenciaMotor        = new  Potencia();
        Direcao DirecaoAutomovel      = new Direcao();
        Cambio CambioVeiculo          = new Cambio();
        ModeloDoVeiculo ModeloVeiculo = new ModeloDoVeiculo();


        String Cor      = CorAutomovel.CorDoVeiculo();    
        String Portas   = QtdPortas.QuantidadeDePortas();
        Double Potencia = PotenciaMotor.PotenciaDoMotor();
        String Direcao  = DirecaoAutomovel.DirecaoDoVeiculo();     
        String Cambio   = CambioVeiculo.CambioDoVeiculo();
        String Modelo   = ModeloVeiculo.ModeloDoVeiculo();

       
       System.out.println("Modelo: "+ Modelo  );
       System.out.println("Cor: "   + Cor     );
       System.out.println("Portas:" + Portas  );
       System.out.println("Direção:"+ Direcao );
       System.out.println("Motor:"  + Potencia);
    }
}