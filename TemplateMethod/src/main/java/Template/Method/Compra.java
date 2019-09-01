package Template.Method;

public abstract class Compra {
    public void Forma(){
        Cartao();
        Boleto();
}
   public abstract void Cartao();
   
   public abstract void Boleto();
    
}
