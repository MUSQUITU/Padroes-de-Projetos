
package factory.method;


public class GeradoraDeConsumo implements GeradoraDeGastos {

    @Override
    public Gastos criarGastos(String gastos) {
        
            if(gastos.equals("agua")){
                return new agua();
            }
            else {
                return new Refri();
            }
        
      
    }
    
}
