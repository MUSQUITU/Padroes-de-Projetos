
package exemplo.fabrica.abstrata;

/**
 *
 * @author musquitu
 */
public class FactoryFactory {
        private static Celular montarCelular(String tipo){
           CelularFactory cf = null; 
           switch(tipo){
               case "iphone":
                   cf = new IPhone();
                   break;
               case "xiomi":
                   cf = new Xiomi();
           }
           Celular celular = new Celular();
           celular.setBateria(cf.montarBateria());
           celular.setCamera(cf.montarCamera());
           return celular;
        }
        public static void main(String[] args) {
         Celular iphone = montarCelular("iphone");
         Celular xiomi= montarCelular("xiomi");
            System.out.println("Fim");
    }
}
