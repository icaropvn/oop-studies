import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HoraSistema {
    public static void main(String[] args) {
        LocalTime horaDoSistema = LocalTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH'h'mm");
        String horaFormatada = horaDoSistema.format(formatador);
        
        System.out.println("Agora são: " + horaFormatada);
    }
}