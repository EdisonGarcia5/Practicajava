
public class App {
    public static void main(String[] args) throws Exception {
        String  cadenaDeCaracteres = " Hola Monzón";
        System.out.println(cadenaDeCaracteres);

        //Instaciando la clase
        Alumno alumno = new Alumno();
        alumno.nombre = "Fulanito";
        alumno.edad = 21;
        alumno.apellidos = "Cosme";

        //Concatenación
        System.out.println("El alumno se llama " + alumno.apellidos + " " + alumno.nombre + " y su edad es: " + alumno.edad );
        System.out.println("");
        alumno.inscripcionAlumno();
        
        System.out.println("Alumno " + alumno.nombre + " " + alumno.promediarAlumno(8, 10));


    }
}
