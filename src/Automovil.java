public class Automovil extends Vehiculo {
    //hereda de vehiculo, hereda a taxi
    /*vehiculo terrestre de 4 ruedas, tamaño camioneta*/
    private String tamaño;
    private double precio; //de viaje
    private String placas;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int year, String tamaño, double precio, String placas) {
        super(marca, modelo, year);
        this.tamaño = tamaño;
        this.precio = precio;
        this.placas = placas;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPlacas() {
        return placas;
    }

    public void setProposito(String placas) {
        this.placas = placas;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "tamaño='" + tamaño + '\'' +
                ", precio=" + precio +
                ", proposito='" + placas + '\'' +
                '}';
    }
    public boolean detener(){
        System.out.println("El pasajero ha abordado");
        return true;
    }
    public boolean avanzar(){
        System.out.println("El vehiculo se ha detenido");
        return true;
    }
}
