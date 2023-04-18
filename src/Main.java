public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("patito", "patito", 2023);
        vehiculo.apagar();
        vehiculo.encender();
        System.out.println(vehiculo);

        Automovil auto = new Automovil("patito", "patito", 2023, "grande", 100,"XXXXX");
        auto.apagar();
        auto.encender();
        auto.detener();
        auto.avanzar();
        System.out.println(auto);

        Taxi taxi = new Taxi("patito", "patito", 2023, "grande", 100,"XXXXX", "Pedrito", 12345, "Distrito 1");
        taxi.apagar();
        taxi.encender();
        taxi.detener();
        taxi.avanzar();
        taxi.iniciarViaje();
        taxi.terminarViaje();
        System.out.println(taxi);
    }
}