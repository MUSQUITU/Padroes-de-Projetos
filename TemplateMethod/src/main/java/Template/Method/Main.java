
package Template.Method;

/**
 *
 * @author musquitu
 */
public class Main {
    public static void main(String[] args) {
        Compra ac = new Livro();
        ac.Forma();
        
        ac = new Caderno();
        ac.Forma();
    }
 
}
