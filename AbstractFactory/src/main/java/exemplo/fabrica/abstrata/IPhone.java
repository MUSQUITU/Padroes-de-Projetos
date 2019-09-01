
package exemplo.fabrica.abstrata;

/**
 *
 * @author musquitu
 */
public class IPhone extends CelularFactory{

    @Override
    public Camera montarCamera() {
       return new CameraMaisOuMenos();
    }

    @Override
    public Bateria montarBateria() {
        return new BateriaRuim();
          }
    
}
