//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
        int clientDeviceYear = 2011;
        int clientOc = 1;
        if (clientDeviceYear <= 2015)
            if (clientOc == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }


        int year = 2021;
        int year1 = 1584;

        {
            if (year % 4 == 0 && year % 100 != 0 || year1 % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }

            int deliveryDistance = 95;
            int deliveryT = 1;
            {

                if (deliveryDistance > 100) {
                    System.out.println("Доставка невозможна");
                } else {
                    if (deliveryDistance < 20) {
                        deliveryT += 0;
                        System.out.println("Доставим Вам вашу карту за сутки" + deliveryT + " дней");
                    } else if (deliveryDistance < 60) {
                        deliveryT += 1;
                        System.out.println("Доставим Вам вашу карту в течении " + deliveryT + " дней");
                    } else if (deliveryDistance < 100) {
                        deliveryT += 2;
                        System.out.println("Доставим Вам вашу карту в течении " + deliveryT + " дней");
                    }


                    int monthNumber = 12;
                    switch (monthNumber) {
                        case 12, 1, 2:
                            System.out.println("Зима");
                            break;
                        case 3, 4, 5:
                            System.out.println("весна");
                            break;
                        case 6, 7, 8:
                            System.out.println("лето");
                            break;
                        case 9, 10, 11:
                            System.out.println("осень");
                            break;
                        default:
                            System.out.println("такого мсяца нет");

                    }

                }
            }
        }
    }
}




















