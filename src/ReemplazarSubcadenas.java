public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //Reemplazar cadenas
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        var cadena2 = cadena1.replace("Mundo", "a todos");
        System.out.println("cadena2 = " + cadena2);

        //reemplazar subcadena hola por adios
        cadena2 = cadena1.replace("Hola", "Adios");
        System.out.println("cadena2 = " + cadena2);
    }
}
