import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class BMExercicio06 {
    public static String getWeekDayByIndex(Integer number) {
        return switch (number) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sabado";
            default -> "Dia da semana inválido";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número referente a um dia da semana");
            int option = Integer.parseInt(scanner.nextLine());

            if (option == 0) {
                break;
            }

            System.out.println(BMExercicio06.getWeekDayByIndex(option));
        }
    }
}
