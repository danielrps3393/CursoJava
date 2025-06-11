public class GeneradorEmail {
    public static void main(String[] args) {
        //Generador de Emails
        System.out.println("*** Generador de Emails ***");
        var nombreUsuario = " Emiliano Pulido Lopez";
        System.out.println("Nombre Usuario = " + nombreUsuario);
        var nombreUsuarionormalizado = nombreUsuario.strip().replace(" ", ".").toLowerCase();
        System.out.println("Nombre Usuario Normalizado = " + nombreUsuarionormalizado + "\n");
        var nombreEmpresa = "Global Mentoring";
        System.out.println("Nombre Empresa = " + nombreEmpresa);
        var extencionDominio = ".com.co";
        System.out.println("Extencion Dominio = " + extencionDominio);
        var dominioEmail = "@" + nombreEmpresa.replace(" ", "").toLowerCase() + extencionDominio;
        System.out.println("Dominio Email = " + dominioEmail + "\n");
        var stringbuffer = new StringBuffer();
        stringbuffer.append(nombreUsuarionormalizado).append(dominioEmail);
        var emailfinal = stringbuffer.toString();
        System.out.println("emailfinal = " + emailfinal);
    }
}
