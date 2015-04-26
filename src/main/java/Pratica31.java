
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Pratica31 {

    private static long fim;
    private static long inicio = System.currentTimeMillis();
    private static String meuNome = ("Cesar Batista");
    private static String meusNomes[] = meuNome.split(" ");
    private static int tamanho = meusNomes.length;
    private static GregorianCalendar dataNascimento = new GregorianCalendar(1995, 4, 9);
    private static GregorianCalendar cal = new GregorianCalendar();
    private static int dias;

    public static void main(String[] args) {
        System.out.println(meuNome.toUpperCase());
        for (int i = tamanho; i > 0; i--) {
            if (i == tamanho) {
                System.out.printf("%s", meusNomes[i - 1].toUpperCase().charAt(0));
                for (int j = 1; j < meusNomes[i - 1].length(); j++) {
                    System.out.printf("%s", meusNomes[i - 1].toLowerCase().charAt(j));
                }
                System.out.printf(", ");
            } else {
                System.out.printf("%s. ", meusNomes[i - 1].toUpperCase().charAt(0));
            }
        }
        dias = (cal.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR)) * 365;
        dias += (cal.get(Calendar.MONTH) - dataNascimento.get(Calendar.MONTH)) * 30;
        dias += cal.get(Calendar.DAY_OF_MONTH) - dataNascimento.get(Calendar.DAY_OF_MONTH);
        for (int i = dataNascimento.get(Calendar.YEAR); i < cal.get(Calendar.YEAR); i++) {
            if (i % 4 == 0) 
                dias++;
        }
        System.out.printf ("\n%d\n",dias);
        fim=System.currentTimeMillis()-inicio;
        System.out.println(fim);
        
        
    }
}
