package exemplo.fabrica.abstrata;

public class Celular {
        Bateria bateria;
        Camera camera;

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
        
        
}
