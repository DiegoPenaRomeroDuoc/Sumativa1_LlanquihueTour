package model;

// Un cliente ES una PERSONA.
// Agrega los datos propios de un cliente de la agencia.
public class Cliente extends Persona {

    private String tourContratado;
    private int cantidadPasajeros;

    //Constructor: super envia los datos comunes a la clase persona
    //Luego se guardan los datos propios del cliente
    public Cliente(String rut, String nombre, String apellido, String telefono,
                   Direccion direccion, String tourContratado, int cantidadPasajeros) {
        super(rut,nombre,apellido,telefono,direccion);
        setTourContratado(tourContratado);
        setCantidadPasajeros(cantidadPasajeros);
    }

    public String getTourContratado() {return tourContratado;}

    public void setTourContratado(String tourContratado) {
        if (tourContratado == null || tourContratado.trim().isEmpty()) {
            throw new IllegalArgumentException("El tour contratado no puede estar vacío");
        }
        this.tourContratado = tourContratado;
    }

    public int getCantidadPasajeros() {return cantidadPasajeros;}

    public void setCantidadPasajeros(int cantidadPasajeros) {
        if (cantidadPasajeros <= 0) {
            throw new IllegalArgumentException("La cantidad de pasajeros debe ser mayor que 0");
        }
        this.cantidadPasajeros = cantidadPasajeros;
    }

    //toString reutiliza el de persona con super y añade lo propio
    @Override
    public String toString() {
        return "---- Cliente ---\n" + super.toString()
                + "\nTour contratado: " + tourContratado
                + "\nPasajeros: " + cantidadPasajeros;
    }
}
