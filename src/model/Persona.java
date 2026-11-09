package model;

//Clase base: guarda los datos comunes de cualquier persona de la agencia.
//Cliente y guia heredan esta clase.
public class Persona {

    //encapsulamiento// atributos privados
    private String rut;
    private String nombre;
    private String apellido;
    private String telefono;
    private Direccion direccion;

    //Constructor recibe los datos y guarda usando los setters
    public Persona(String rut, String nombre, String apellido,
                   String telefono, Direccion direccion) {
        setRut(rut);
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setDireccion(direccion);
    }

    //Getters y Setters

    public String getRut() {return rut;}

    public void setRut(String rut) {
        if (rut == null || rut.trim().isEmpty()){
            throw new IllegalArgumentException("El RUT no puede estar vacío");
        }
        this.rut = rut;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()){
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }
        this.apellido = apellido;
    }

    public String getTelefono() {return telefono;}

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()){
            throw new IllegalArgumentException("El teléfono no puede estar vacío");
        }
        this.telefono = telefono;
    }

    public Direccion getDireccion() {return direccion;}

    public void setDireccion(Direccion direccion) {
        if(direccion == null) {
            throw   new IllegalArgumentException("La direccion no puede ser nula");
        }
        this.direccion = direccion;
    }

    //toString: muestra cada dato en su propia línea
    @Override
    public String toString() {
        return "RUT: " + rut + "\nNombre: " + nombre + " " + apellido
                + "\nTeléfono: " + telefono + "\nDirección: " + direccion;
    }
}