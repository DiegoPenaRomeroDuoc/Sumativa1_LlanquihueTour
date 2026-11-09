package app;

// Se importan las clases del paquete model para usarlas
 import model.Cliente;
 import model.Direccion;
 import model.Guia;
 import model.Persona;

 //Clase principal, aquí se ejecuta el programa
public class Main {
    public static void main(String[] args) {
        // 1. Se crean tres direcciones. El complemento es opcional: "" si no hay
        Direccion dir1 = new Direccion("Av. Ernesto Ewert", "120", "", "Llanquihue", "Los Lagos");
        Direccion dir2 = new Direccion("Calle Errázuriz", "0521", "Villa Los Lagos", "Puerto Varas", "Los Lagos");
        Direccion dir3 = new Direccion("Av. Vicente Pérez Rosales", "989", "Torre A, depto 21", "Frutillar", "Los Lagos");

        // 2. Se crean dos clientes y un guía, cada uno con su dirección
        Cliente cliente1 = new Cliente("12.345.678-9", "Camila", "Soto",
                "+56911112222", dir1, "Paseo lacustre", 3);
        Cliente cliente2 = new Cliente("15.678.901-2", "Diego", "Muñoz",
                "+56933334444", dir3, "Ruta gastronómica", 2);
        Guia guia1 = new Guia("10.987.654-3", "Marta", "Álvarez",
                "+56955556666", dir2, "Español, Inglés", 8);

        // 3. Se muestran por consola (println llama automáticamente a toString)
        System.out.println(cliente1);
        System.out.println(); // línea en blanco para separar
        System.out.println(cliente2);
        System.out.println();
        System.out.println(guia1);


        // 4. Pruebas de validación: cada caso debe fallar con su mensaje
        System.out.println();
        System.out.println("=== PRUEBAS DE VALIDACIÓN ===");

// 1. Direccion: número vacío
        try {
            Direccion d = new Direccion("Calle Prueba", "  ", "", "Llanquihue", "Los Lagos");
            System.out.println(d);
        } catch (IllegalArgumentException e) {
            System.out.println("1. Direccion -> " + e.getMessage());
        }

// 2. Persona: nombre vacío
        try {
            Persona p = new Persona("11.111.111-1", "", "Pérez", "+56900000000", dir1);
            System.out.println(p);
        } catch (IllegalArgumentException e) {
            System.out.println("2. Persona -> " + e.getMessage());
        }

// 3. Cliente: cantidad de pasajeros en 0
        try {
            Cliente c = new Cliente("12.222.222-2", "Ana", "Rojas", "+56911111111",
                    dir1, "Paseo lacustre", 0);
            System.out.println(c);
        } catch (IllegalArgumentException e) {
            System.out.println("3. Cliente -> " + e.getMessage());
        }

// 4. Guia: años de experiencia negativos
        try {
            Guia g = new Guia("13.333.333-3", "Luis", "Vera", "+56922222222",
                    dir1, "Español", -3);
            System.out.println(g);
        } catch (IllegalArgumentException e) {
            System.out.println("4. Guia -> " + e.getMessage());
        }

// 5. Cliente con dirección nula (error heredado de Persona)
        try {
            Cliente c2 = new Cliente("14.444.444-4", "Eva", "Núñez", "+56933333333",
                    null, "Ruta gastronómica", 2);
            System.out.println(c2);
        } catch (IllegalArgumentException e) {
            System.out.println("5. Cliente -> " + e.getMessage());
        }
    }
 }
