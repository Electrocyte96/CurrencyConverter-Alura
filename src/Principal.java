import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acccion = 0;
        double montoConvertido, monto = 0;
        Conversor conversor = new Conversor();
        while (acccion != 7){
            System.out.println("***************************************************************************");
            System.out.println("             Bienvenido al Conversor de monedas de Alura \n");
            System.out.println("Seleccione una opción introduciendo un número válido: ");
            System.out.println("1) USD => ARS");
            System.out.println("2) ARS => USD");
            System.out.println("3) USD => BRL");
            System.out.println("4) BRL => USD");
            System.out.println("5) USD => COP");
            System.out.println("6) COP => USD");
            System.out.println("7) Salir");
            System.out.println("***************************************************************************");
            acccion = sc.nextInt();
            if (acccion==7){
                break;
            } else {
                System.out.println("Introduce un valor a convertir");
                monto = sc.nextDouble();
                montoConvertido = conversor.convertir(acccion, monto);
                if (acccion == 1){
                    System.out.println(monto +" USD equivale a "+ montoConvertido
                    + " ARS");
                } else if (acccion == 2) {
                    System.out.println(monto +" ARS equivale a "+ montoConvertido
                            + " USD");
                } else if (acccion == 3) {
                    System.out.println(monto +" USD equivale a "+ montoConvertido
                            + " BRL");
                } else if (acccion == 4) {
                    System.out.println(monto +" BRL equivale a "+ montoConvertido
                            + " USD");
                } else if (acccion == 5) {
                    System.out.println(monto +" USD equivale a "+ montoConvertido
                            + " COP");
                } else if (acccion == 6) {
                    System.out.println(monto +" COP equivale a "+ montoConvertido
                            + " USD");
                }
            }
        }



    }
}
