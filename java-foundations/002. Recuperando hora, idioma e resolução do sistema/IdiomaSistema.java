import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale localSistema = Locale.getDefault();
        
        System.out.println("Código ISO do idioma: " + localSistema.getLanguage());
        System.out.println("Idioma: " + localSistema.getDisplayLanguage());
    }
}