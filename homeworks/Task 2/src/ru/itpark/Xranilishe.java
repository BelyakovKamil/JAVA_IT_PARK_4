package ru.itpark;

import java.util.Scanner;

public class Xranilishe {
    public static void main(String[] args) {
        int[] array = new int[100];
        int count = 0, i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("МЕНЮ:");
        System.out.println("1. Показать массив");
        System.out.println("2. Добавить в начало");
        System.out.println("3. Добавить в конец");
        System.out.println("4. Удалить по позиции");
        System.out.println("5. Выход");
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
                                for (i = 0; i < 100; i++) {
                                    System.out.print(array[i] + " ");
                                }
                                System.out.println();
                                break metka;
                            }
                        }


                    case 2:

                        metka2:
                        { // Метки: 2, 3 , 4 - созданны для того, чтобы занво не выбирать команду из-за некритической ошибки

                            if (count == 100) {
                                System.out.println("Ошибка!!! Массив заполнен!!!");
                                System.out.println();
                                break metka;
                            } else {
                                System.out.println("Какое число добавить в начало?");
                                int b = scanner.nextInt();
                                if (b == 0) {
                                    System.out.println("Ошибка!!! Введите другое значение!!!");
                                    System.out.println();
                                    break metka2;
                                } else {
                                    for (i = 99; i > 0; i--) {
                                        array[i] = array[i - 1];
                                    }
                                    array[0] = b;
                                    count++;
                                }
                            }
                            break metka;
                        }


                    case 3:
                        metka3:
                        {

                            if (count == 100) {
                                System.out.println("Ошибка!!! Массив заполнен!!!");
                                System.out.println();
                                break metka;
                            } else {
                                System.out.println("Какое число добавить в конец?");
                                int e = scanner.nextInt();
                                if (e == 0) {
                                    System.out.println("Ошибка!!! Введите другое значение!!!");
                                    System.out.println();
                                    break metka3;
                                } else {
                                    for (i = 0; i < 100; i++) {
                                        if (array[i] == 0) {
                                            array[i] = e;
                                            count++;
                                            break metka;
                                        }
                                    }
                                }
                            }
                        }


                    case 4:

                        metka4:
                        {
                            if (count == 0) {
                                System.out.println("ОШИБКА!!! Массив пустой!!!");
                                System.out.println();
                                break metka;
                            } else {

                                System.out.println("Какой номер удалить?");
                                int d = scanner.nextInt();
                                if (d < 0 || d > 99) {
                                    System.out.println("ОШИБКА!!! Выход за границы массива!!!");
                                    System.out.println();
                                    break metka4;
                                } else {
                                    for (d = d; d < 100; d++) {
                                        array[d - 1] = array[d];
                                    }
                                    count--;
                                }
                                break;
                            }
                        }

                    case 5:
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

