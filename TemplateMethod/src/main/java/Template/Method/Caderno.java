
package Template.Method;

/**
 *
 * @author musquitu
 */
public class Caderno extends Compra {

    @Override
    public void Cartao() {
         System.out.println("Caderno\nPagamento no Cartao");
          }

    @Override
    public void Boleto() {
        System.out.println("Pagamento no boleto");
          }
    
}
