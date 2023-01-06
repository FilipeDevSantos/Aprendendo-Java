import java.util.Calendar;

public class Arrays {

    public static void main(String[] args) {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        String[] mes = {"Jan", "Feb", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int[] quantidadeDia = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};

        for(int c=0; c<=mes.length-1; c++) {
            if(anoAtual % 4 == 0) {
                quantidadeDia[2] = 29;
            }
            System.out.println(mes[c] + " tem "+ quantidadeDia[c] + " dias");
        }
    }
}
