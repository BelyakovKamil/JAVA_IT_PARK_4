import java.util.Scanner;

public class Xranilishe {


    // Процедуры


    //  Эта процедура отвечает за вывод массива.

    public static void showMassive(int[] b) {
        for (int i = 0; i < 100; i++) {
            System.out.print(b[i] + " ");
        }
    }


    // Функции

    // Эта функция отвечает за добавление нового элемента в начало массива.

    public static boolean addToBeginOfMassive(int[] a, boolean k) {

        Scanner in = new Scanner(System.in);

        System.out.println("Какое число добавить в начало?");
        int begin = in.nextInt();

        if (begin == 0) {
            System.out.println("Ошибка!!! Введите другое значение!!!");
            System.out.println();
            k = false;
        } else {

            for (int i = 99; i > 0; i--) {
                a[i] = a[i - 1]; // Сдвиг массива
            }
            a[0] = begin;
            k = true;
        }
        return k;
    }


    // Эта функция отвечает за добавление нового элемента в конец массива.

    public static boolean addToEndOfMassive(int[] a, boolean k) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какое число добавить в конец?");
        int end = in.nextInt();
        if (end == 0) {
            System.out.println("Ошибка!!! Введите другое значение!!!");
            System.out.println();
            k = false;
        } else {
            for (int i = 0; i < 100; i++) {
                if (a[i] == 0) {
                    a[i] = end;
                    break;
                }
            }
            k = true;
        }
        return k;
    }

    // Эта функция отвечает за удаление по позиции

    public static boolean deletePosition(int[] a, boolean k) {
        Scanner in = new Scanner(System.in);

        System.out.println("Какой номер удалить?");
        int number = in.nextInt();


        if (number < 0 || number > 100) {
            System.out.println("ОШИБКА!!! Выход за границы массива");
            System.out.println();
            k = false;
        }
        else {
            if (a[number-1] == 0) {
                System.out.println("ОШИБКА!!! Он и так пуст!!!");
                System.out.println();
                k = false;
            }
            else {
                for (int i = number; i < 100; i++) {
                    a[i - 1] = a[i];
                    k = true;
                }
            }
        }
        return k;
    }


    public static void main(String[] args) {
        int[] array = new int[100];
        int count = 0;
        int g = 99;
        Scanner scanner = new Scanner(System.in);
        System.out.println("МЕНЮ:");
        System.out.println("1. Показать массив");
        System.out.println("2. Добавить в начало");
        System.out.println("3. Добавить в конец");
        System.out.println("4. Удалить по позиции");
        System.out.println("5. Отсортировать массив");
        System.out.println("6. Выход");
        System.out.println();


        while (true) {

            metka:
            { // Мтеку создал ,чтобы при ошибке, возвращаться к выводу сообщения

                System.out.println("Что нужно сделать?");

                int command = scanner.nextInt();

                switch (command) {
                    case 1:
                        if (count == 0) {
                            System.out.println("ОШИБКА!!! Массив пустой!!!");
                            System.out.println();
                            break metka;
                        } else {
                            if (count > 100) {
                                System.out.println("ОШИБОЧКА!!! Перебор!!!");
                                System.exit(0);
                            } else {
                                System.out.println("Количество элементов в массиве " + count);
                                System.out.println();
                                showMassive(array); // Вызов процедуры
                            }
                            System.out.println();
                            break metka;
                        }


                    case 2:
                        if (count == 100) {
                            System.out.println("Ошибка!!! Массив заполнен!!!");
                            System.out.println();
                            break metka;
                        } else {
                            boolean o = addToBeginOfMassive(array, true);
                            if (o == true) // Проверяю k в функции (на добавление в начало) на истинность: если верно - то счетчик увеличивается, неверно- ничего не происходит
                                count++;
                        }

                        break metka;


                    case 3:

                        if (count == 100) {
                            System.out.println("Ошибка!!! Массив заполнен!!!");
                            System.out.println();
                            break metka;
                        } else {
                            boolean o = addToEndOfMassive(array, true);
                            if (o == true) // Проверяю k в функции (на добавление в конец) на истинность: если верно - то счетчик увеличивается, неверно- ничего не происходит
                                count++;
                        }
                        break metka;

                    case 4:


                        if (count == 0) {
                            System.out.println("ОШИБКА!!! Массив пустой!!!");
                            System.out.println();
                            break metka;
                        } else {
                            boolean o = deletePosition(array, true);
                            if (o == true) // Проверяю k в функции (на удаление по позиции) на истинность: если верно - то счетчик уменьшается, неверно- ничего не происходит
                                count--;
                        }
                        break;

                        case 5:



                    case 6:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Команда не верна!!!");
                        System.out.println();
                        break metka;
                }
            }
        }
    }
}
