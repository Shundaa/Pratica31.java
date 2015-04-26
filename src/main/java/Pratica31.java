
import java.util.Date;
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

    private static long inicio = System.currentTimeMillis();
    private static long fim;
    private static String meuNome = ("Cesar Batista");
    private static String meusNomes[] = meuNome.split(" ");
    private static int tamanho = meusNomes.length;
    private static GregorianCalendar dataNascimento = new GregorianCalendar(1995, 4, 9);
    private static GregorianCalendar cal = new GregorianCalendar();
    private static Date data;
    private static Date data2;
    private static long dia;
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
       data=cal.getTime();
       data2=dataNascimento.getTime();
       System.out.printf("\n");
       System.out.printf("%d\n",(data.getTime()-data2.getTime())/86400000);
       fim=System.currentTimeMillis()-inicio;
       System.out.println(fim);
    }
}
