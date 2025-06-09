public class ComparacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        // comparacion de referencias con ==
        System.out.println(cadena1 == cadena2);
        System.out.println(cadena1 == cadena3);

        //Comparacion de contenido con equals
        System.out.println(cadena1.equals(cadena3));
        System.out.println(cadena2.equals(cadena3));

    }
}
