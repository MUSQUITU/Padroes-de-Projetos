
package Template.Method;

/**
 *
 * @author musquitu
 */
public class Livro extends Compra{

    @Override
    public void Cartao() {
        System.out.println("Livro\nPagamento no Cartao");
          }

    @Override
    public void Boleto() {
        System.out.println("Pagamento no boleto");
          }
    
}
