public class Compra implements Comparable<Compra> {
    private double valor;
    private String decripcion;

    public Compra(double valor, String decripcion) {
        this.valor = valor;
        this.decripcion = decripcion;
    }

    public double getValor() {
        return valor;
    }

    public String getDecripcion() {
        return decripcion;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "valor=" + valor +
                ", decripcion='" + decripcion + '\'' +
                '}';
    }

    public String getDescripcion() {return  decripcion;}

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
