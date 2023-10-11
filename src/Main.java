import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Здраствуйте в наш магазин <ЕЛ АЗЫК> что хотите купит?");
            System.out.println("Что хотите <Фрукты> <Хлеб> <Мыломоющие> <Напитки> ");
            String st = scanner.nextLine();
            if (Objects.equals(st, "Фрукты")) {

                System.out.println("Алма");
                System.out.println("Банан");
                System.out.println("Ананас");
                System.out.println("Киви");
                String string = scanner.nextLine();
                if (Objects.equals(string, "Алма")) {
                    System.out.println("Алманын бассы 100 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Алманын "+"количествосу " + kolichestvo+" C вас"+ 100 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");

                }
                if (Objects.equals(string, "Банан")) {
                    System.out.println("Банандын бассы 80 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Банандын "+"количествосу " + kolichestvo+" C вас"+ 80 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");

                }
                if (Objects.equals(string, "Ананас")) {
                    System.out.println("Ананастын бассы 190 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Ананастын "+"количествосу " + kolichestvo+" C вас"+ 190 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");
                }
                if (Objects.equals(string, "Киви")) {
                    System.out.println("Кивинин бассы 70 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Кивинин "+"количествосу " + kolichestvo+" C вас"+ 70 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");
                }
                break;


            }
            if (Objects.equals(st, "Хлеб")) {

                System.out.println("Нан");
                System.out.println("Булочка");
                System.out.println("Печение");
                System.out.println("Сочинский");
                String string = scanner.nextLine();
                if (Objects.equals(string, "Нан")) {
                    System.out.println("Нан бассы 100 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Нандын "+"количествосу " + kolichestvo+" C вас"+ 100 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");

                }
                if (Objects.equals(string, "Булочка")) {
                    System.out.println("Булочканын бассы 80 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Булочканын "+"количествосу " + kolichestvo+" C вас"+ 80 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");

                }
                if (Objects.equals(string, "Печение")) {
                    System.out.println("Печениянын бассы 190 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Печениянын "+"количествосу " + kolichestvo+" C вас"+ 190 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");
                }
                if (Objects.equals(string, "Сочинский")) {
                    System.out.println("Сочинскийдин бассы 70 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Сочинскийдин "+"количествосу " + kolichestvo+" C вас"+ 70 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");
                }
                break;


            }if (Objects.equals(st, "Мыломоющие")) {

                System.out.println("Самын");
                System.out.println("Шампунь");
                System.out.println("Бальзам");
                System.out.println("Гель");
                String string = scanner.nextLine();
                if (Objects.equals(string, "Самын")) {
                    System.out.println("Самындын бассы 100 сом");
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");

                }
                if (Objects.equals(string, "Шампунь")) {
                    System.out.println("Шампундун бассы 80 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Шампундун "+"количествосу " + kolichestvo+" C вас"+ 80 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");

                }
                if (Objects.equals(string, "Бальзам")) {
                    System.out.println("Балзамдын бассы 190 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Балзамдын "+"количествосу " + kolichestvo+" C вас"+ 190 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");
                }
                if (Objects.equals(string, "Гель")) {
                    System.out.println("Гелдин бассы 70 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Гелдин "+"количествосу " + kolichestvo+" C вас"+ 100 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");
                }
                break;

            }if (Objects.equals(st, "Напитки")) {

                System.out.println("Кола");
                System.out.println("Фанта");
                System.out.println("Сок");
                System.out.println("Тархун");
                String string = scanner.nextLine();
                if (Objects.equals(string, "Кола")) {
                    System.out.println("Коланын бассы 100 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Коланын "+"количествосу " + kolichestvo+" C вас"+ 100 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");

                }
                if (Objects.equals(string, "Фанта")) {
                    System.out.println("Фантанын бассы 80 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Фантанын "+"количествосу " + kolichestvo+" C вас"+ 80 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");

                }
                if (Objects.equals(string, "Сок")) {
                    System.out.println("Соктун бассы 190 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Соктун "+"количествосу " + kolichestvo+" C вас"+ 190 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");
                }
                if (Objects.equals(string, "Тархун")) {
                    System.out.println("Тархундун бассы 70 сом");
                    System.out.println("Введите количество");
                    int kolichestvo = scanner.nextInt();
                    System.out.println("Тархундун "+"количествосу " + kolichestvo+" C вас"+ 70 * kolichestvo );
                    String str3 = scanner.nextLine();
                    System.out.println("Спасибо за покупки");
                }
                break;
            }

        }

    }




}