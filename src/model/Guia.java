package model;


// Un guía ES una Persona
// añade los datos de propios del guía turistico
public class Guia extends Persona{
    private String idiomas;
    private int aniosExperiencia;

    //Constructor: super envia los datos comunes a la clase persona
    public Guia(String rut, String nombre, String apellido, String telefono,
                Direccion direccion, String idiomas, int aniosExperiencia) {
        super(rut,nombre,apellido,telefono,direccion);
        setIdiomas(idiomas);
        setAniosExperiencia(aniosExperiencia);
    }

    public String getIdiomas() {return idiomas;}

    public void setIdiomas(String idiomas) {
        if (idiomas == null || idiomas.trim().isEmpty()) {
            throw new IllegalArgumentException("Los idiomas no pueden estar vacíos");
        }
        this.idiomas = idiomas;
    }

    public int getAniosExperiencia() {return aniosExperiencia;}

    //puede ser 0 (guía nuevo), pero no puede ser negativo
    public void setAniosExperiencia(int aniosExperiencia) {
        if (aniosExperiencia < 0) {
            throw new IllegalArgumentException("Los años de experiencia no pueden ser negativos");
        }
        this.aniosExperiencia = aniosExperiencia;
    }
    //toString reutiliza el "persona" y añade los datos del guia
    @Override
    public String toString() {
        return "---- Guía ---\n" + super.toString()
                + "\nIdiomas: " + idiomas
                + "\nAños de experiencia: " + aniosExperiencia;
    }
}
