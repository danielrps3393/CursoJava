public class MetodosDeCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //longitud del contenido de la variable
        var cadena2 = cadena1.length();
        System.out.println("longitud = " + cadena2);

        //nuevo valor reemplzando 'o' por 'a'
        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("cadena nueva = " + nuevaCadena);

        //convertir minusculas a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //convertir mayusculas a minusculas
        var minusculas = cadena1.toLowerCase();
        System.out.println("minusculas = " + minusculas);

        //retirar espacios vacios
        var espacios = "  Hola Mundo   ";
        System.out.println("espacios = " + espacios.trim());
    }
}
