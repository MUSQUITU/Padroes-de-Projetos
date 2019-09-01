
package exemplo.fabrica.abstrata;

/**
 *
 * @author musquitu
 */
public class Xiomi  extends CelularFactory{

    @Override
    public Camera montarCamera() {
       return new CameraBoa();
    }

    @Override
    public Bateria montarBateria() {
        return new BateriaBoa();
         }
    
}
