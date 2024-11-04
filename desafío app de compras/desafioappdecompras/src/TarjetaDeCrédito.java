import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCrédito {
    private double límite;
    private double saldo;
    private List<Compra> listaDeCompras;

    public TarjetaDeCrédito(double límite) {
        this.límite = límite;
        this.saldo = límite;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean lanzarCompra(Compra compra){
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    public double getLímite() {
        return límite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
