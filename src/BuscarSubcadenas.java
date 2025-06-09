public class BuscarSubcadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //Retorna el indice inical de la variable cadena1
        var subcadena1 = cadena1.indexOf("Hola");
        System.out.println("subcadena1 = " + subcadena1);

        //Retorna el indice final de la variable cadena1
        var subcadena2 = cadena1.lastIndexOf("Mundo");
        System.out.println("subcadena2 = " + subcadena2);

        //retorna el error en una cadena no encontrada en la variable cadena1
        var subcadena3 = cadena1.indexOf("Java");
        System.out.println("subcadena3 = " + subcadena3);
    }
}
