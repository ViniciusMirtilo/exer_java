package contribuinte;

public class Contribuinte {
   private String nome;
   protected double rendabrutaanual;
   protected double rendaliquidaanual;
   
   public void setnome(String nome){
        this.nome = nome;
   }
   public String getnome(){
       return nome;
   }
   public void setrendabrutaanual(double rendabrutaanual){
       this.rendabrutaanual = rendabrutaanual;
   }
   public double getrendabrutaanual(){
       return rendabrutaanual;
   }
   public double getrendaliquidaanual(){
       return rendaliquidaanual;
   }
   public double calcularendaliquida(double abatimento1, double abatimento2){
        rendaliquidaanual = rendabrutaanual - (abatimento1 + abatimento2);
        return rendaliquidaanual;
    }
}
