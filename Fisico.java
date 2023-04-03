package contribuinte;

public class Fisico extends Contribuinte{
    private String cpf;
    private double gastosaude;
    private double gastoeducacao;
    
    
    public void setcpf(String c){
        this.cpf = c;
    }
    public String getcpf(){
        return cpf;
    }
    public void setgastosaude(double gs){
        this.gastosaude = gs;
    }
    public double getgastosaude(){
        return gastosaude;
    }
    public void setgastoeducacao(double ge){
        this.gastosaude = ge;
    }
    public double getgastoeducacao(){
        return gastoeducacao;
    }
    
    public double calcularimpostoderenda(){
        double aux = 0;
        if(rendaliquidaanual <= 10000){
            aux = 0;
        }
        else if(rendaliquidaanual <= 20000){
            aux = rendaliquidaanual * 0.1 - 1000;
        }
        else{
            aux = rendaliquidaanual * 0.25 - 4000;
        }
        return aux;
    }
}

