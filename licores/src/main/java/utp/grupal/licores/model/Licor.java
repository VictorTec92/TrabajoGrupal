package utp.grupal.licores.model;

public class Licor {
    private String tipo;
    private String marca;   
    private int grado;
    private double precio;

    public Licor(String t, String m, int g, double p){
        tipo=t;
        marca=m;
        grado=g;
        precio=p;
    }

    public int getGrado() {
        return grado;
    }
    public void setGrado(int grado) {
        this.grado = grado;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
