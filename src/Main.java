public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1:");
        int monthlyInvestment = 15000;
        int accumulatedSum = 0;
        int months = 0;
        while (accumulatedSum < 2459000) {
            accumulatedSum = accumulatedSum + monthlyInvestment;
            months = months + 1;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + accumulatedSum + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2:");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        i = 10;
        for (; i > 0;) {
            System.out.print(i + " ");
            --i;
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3:");
        int population = 12000000;
        int fertilityRate = 17;
        int mortalityRate = 8;
        int year = 0;
        while (year < 10) {
            population = population + ((population / 1000) * (fertilityRate - mortalityRate));
            ++year;
            System.out.println("Год " + year + ", население составляет " + population + " человек");
        }
    }
    public static void task4() {
        System.out.println("Задача 4:");
        int monthlyInvestement = 15000;
        int accumulatedSum = 0;
        int months = 0;
        while (accumulatedSum < 12000000) {
            accumulatedSum = accumulatedSum + (accumulatedSum / 100) * 7;
            accumulatedSum = accumulatedSum + monthlyInvestement;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + accumulatedSum + " рублей");
        }
    }
    public static void task5() {
        System.out.println("Задача 5:");
        int monthlyInvestement = 15000;
        int accumulatedSum = 0;
        int months = 0;
        while (accumulatedSum < 12000000) {
            accumulatedSum = accumulatedSum + (accumulatedSum / 100) * 7;
            accumulatedSum = accumulatedSum + monthlyInvestement;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + accumulatedSum + " рублей");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6:");
        int monthlyInvestement = 15000;
        int accumulatedSum = 0;
        int months = 0;
        while (months < 108) {
            accumulatedSum = accumulatedSum + (accumulatedSum / 100) * 7;
            accumulatedSum = accumulatedSum + monthlyInvestement;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + accumulatedSum + " рублей");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7:");
        int firstFriday = 1;
        int day = 0;
        while (day < 31) {
            ++day;
            if (day % 7 == firstFriday || (firstFriday == 7 && day % 7 == 0)) {
                System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет.");
            }
        }
    }
    public static void task8() {
        System.out.println("Задача 8:");
        int startYear = 2023 - 200;
        int endYear = 2023 + 100;
        int year = startYear;
        while (year < endYear) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
            ++year;
        }
    }
}