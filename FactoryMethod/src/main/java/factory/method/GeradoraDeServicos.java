
package factory.method;


public class GeradoraDeServicos  implements GeradoraDeGastos {

    @Override
    public Gastos criarGastos(String gastos) {
        
        if (gastos.equals("arrumadeira")){
            return new arrumadeira();
        } else {
            return new lavanderia();
        }
   
    }
    
}
