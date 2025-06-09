public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";

        //usando + para concatenar
        var resultado = cadena1 + " " + cadena2;
        System.out.println("resultado usando + = " + resultado);

        //usando stringbuilder
        var contructorCadenas = new StringBuilder();
        contructorCadenas.append(cadena1).append(" ").append(cadena2);
        resultado = contructorCadenas.toString();
        System.out.println("resultado usando stringbuilder= " + resultado);


        //usando Stringbuffer
        var stringbuffer = new StringBuffer();
        stringbuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringbuffer.toString();
        System.out.println("resultado usando stringbuffer= " + resultado);

        //join
        resultado = String.join(" ", cadena1, cadena2);
        System.out.println("resultado usando Join= " + resultado);

    }
}
