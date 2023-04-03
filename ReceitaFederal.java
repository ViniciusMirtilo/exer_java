package contribuinte;
public class ReceitaFederal {

    public static void main(String[] args){
        Fisico f = new Fisico ();
        f.setnome("Maria");
        f.setcpf("000.000.000-00");
        f.setrendabrutaanual(35000);
        f.setgastoeducacao(4800);
        f.setgastosaude(7500);
        f.calcularendaliquida(f.getgastoeducacao(),f.getgastosaude());
        double aux = f.calcularimpostoderenda();
        
        System.out.println("Nome..." + f.getnome());
        System.out.println("CPF..." + f.getcpf());
        System.out.println("Renda liquida..." + f.getrendaliquidaanual());
        System.out.println("IRPF..." + f.calcularimpostoderenda());
    }
}
