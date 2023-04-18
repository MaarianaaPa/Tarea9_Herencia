public class Taxi extends Automovil {
    //hereda de automovil
    private String conductor;
    private int numLicencia;
    private String distrito;

    public Taxi() {
    }

    public Taxi(String marca, String modelo, int year, String tamaño, double precio, String placas, String conductor, int numLicencia, String distrito) {
        super(marca, modelo, year, tamaño, precio, placas);
        this.conductor = conductor;
        this.numLicencia = numLicencia;
        this.distrito = distrito;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "conductor='" + conductor + '\'' +
                ", numLicencia=" + numLicencia +
                ", distrito='" + distrito + '\'' +
                '}';
    }

    public boolean iniciarViaje(){
        System.out.println("El vehiculo esta avanzando");
        return true;
    }
    public boolean terminarViaje(){
        System.out.println("El vehiculo se ha detenido, el pasajero ha bajado");
        return true;
    }
}
