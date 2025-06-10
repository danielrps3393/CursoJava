public class EjemploConcatenacion {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";

        var resultado = cadena1 + cadena2;
        System.out.println("resultado = " + resultado);

        var stringBuffer =  new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado = " + resultado);

        var stringbuilder = new StringBuilder();
        stringbuilder.append(cadena1).append(" ").append(cadena2);
        resultado = stringbuilder.toString();
        System.out.println("resultado = " + resultado);

        resultado = String.join(" ", cadena1, cadena2);
        System.out.println("resultado = " + resultado);
    }
}
