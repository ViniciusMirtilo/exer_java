package contribuinte;

public class Juridico extends Contribuinte{
    private String cpnj;
    private double gastospessoal;
    private double gastosequipamentos;
    
    
    public void setcpnj(String cj){
        this.cpnj = cj;
    }
    public String setcpnj(){
        return cpnj;
    }
    public void setgastospessoal(double gp){
        this.gastospessoal = gp;
    }
    public double getgastospessoal(){
        return gastospessoal;
    }
    public void setgastosequipamentos(double ge){
        this.gastosequipamentos = ge;
    }
    public double getgastosequipamentos(){
        return gastosequipamentos;
    }
    
    public double calcularimpostoderenda(){
        double aux = 0;
        if(rendaliquidaanual <= 100000){
            aux = 0;
        }
        else if(rendaliquidaanual <=200000){
            aux = rendaliquidaanual * 0.1 - 5000;
        }
        else{
            aux = rendaliquidaanual * 0.25 - 45000;
        }
        return aux;
    }
}
