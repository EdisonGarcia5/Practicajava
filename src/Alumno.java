public class Alumno {

    int edad;
    String nombre;
    String apellidos;


    //Creación de metodos
    //1. Inciamos diciendo si es publico o privado
    //2. Decimos si devuelve o no un valor
    //3. Escribimos el nombre del método
    //4. Entre parentesis decimos si recibe algo
    //5 por ultimo las llaves
    public void inscripcionAlumno(){
        System.out.println("Inscribiremos al alumno");
    }

    public String  promediarAlumno(int califMatematicas, int califEspanol){
        int suma = califEspanol + califMatematicas;
        float promedio = suma/2;

        return "Promedio es: " + promedio;
    }
    
}
