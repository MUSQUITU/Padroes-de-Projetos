
package factory.method;


public class Cliente {
            
    public static void main(String[] args){
        GeradoraDeGastos gerador = new GeradoraDeConsumo();
        Gastos gastos = gerador.criarGastos("agua");
        gastos.mostarInfor();
        System.out.println();
        
        gerador = new GeradoraDeConsumo();
        gastos = gerador.criarGastos("Refri");
       gastos.mostarInfor();
        System.out.println();
        
        gerador = new GeradoraDeServicos();
        gastos = gerador.criarGastos("arrumadeira");
        gastos.mostarInfor();
        System.out.println();
       
        gerador = new GeradoraDeServicos();
        gastos = gerador.criarGastos("lavanderia");
        gastos.mostarInfor();
        System.out.println();
    }
    
    
}
