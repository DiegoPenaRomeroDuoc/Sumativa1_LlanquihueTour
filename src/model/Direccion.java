package model;

//Representa la dirección de una persona.
//Esta clase se usa dentro de Persona
public class Direccion {

    private String calle;
    private String numero; //String porque acepta "0521", "989" o "S/N"
    private String complemento; //opcional: "Torre S, depto 22",  "Parcela 1 sitio 4", "Villa Las Torres", etc.
    private String comuna;
    private String region;

    //Constructor
    public Direccion(String calle, String numero, String complemento,
                     String comuna, String region) {
        setCalle(calle);
        setNumero(numero);
        setComplemento(complemento);
        setComuna(comuna);
        setRegion(region);
    }

    //Getter y Setters

    public String getCalle() {return calle;}

    public void setCalle(String calle) {
        if(calle == null || calle.trim().isEmpty()) {
            throw new IllegalArgumentException("La calle no puede estar vacía");
        }
        this.calle = calle;
    }

    public String getNumero() {return numero;}

    public void setNumero(String numero) {
        if(numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("El número no puede estar vacío. " +
                    "Si no tiene numero ingresar como: S/N");
        }
        this.numero = numero;
    }

    public String getComplemento() {return complemento;}

        //El complemento es opcional, si no tiene datos se guardará como texto vacío
    public void setComplemento(String complemento) {
            if(complemento == null) {
                this.complemento = "";
            }else {
                this.complemento = complemento.trim();
            }
        }

    public String getComuna() {return comuna;}

    public void setComuna(String comuna) {
            if (comuna == null || comuna.trim().isEmpty()) {
                throw new IllegalArgumentException("La comuna no puede estar vacía");
            }
        this.comuna = comuna;
    }

    public String getRegion() {return region;}

    public void setRegion(String region) {
        if (region == null || region.trim().isEmpty()) {
            throw new IllegalArgumentException("La región no puede estar vacía");
        }
        this.region = region;
    }
    //toString devuelve la dirección como un texto legible.
    //el complemento solo se muestra si existe.

    @Override
    public String toString() {
        String texto = calle + " " + numero;
        if (!complemento.isEmpty()) {
            texto = texto + ", " + complemento;
        }
        return texto + ", " + comuna + ", " + region;
    }

}

