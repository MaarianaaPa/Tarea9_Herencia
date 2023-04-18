public class Vehiculo {
    //hereda a automovil
    /*3 vehiculo cualquier medio de transporte*/
    protected String marca;
    protected String modelo;
    protected int year;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                '}';
    }
    public void encender() {
        System.out.println("El vehiulo se ha encendido");
    }

    public void apagar() {
        System.out.println("El vehiculo se ha apagado");
    }
}
