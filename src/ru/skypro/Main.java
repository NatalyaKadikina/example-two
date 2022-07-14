package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int dog = 7;
        byte cat = 1;
        short mouse = 3;
        long elephant = 110L;
        double sugarWeight = 4.5;
        float saltWeight = 1.5f;
        boolean dogIsAdult = dog > 10;
        char bar = 35;

        // Задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOffAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightOffAllBoxers);
        System.out.println("Разница в весе боксеров " + weightDifference);

        // Задача 3
        int banana = 5;
        int weightBanana = 80;
        int milk = 2;
        int weightMilk = 105;
        int iceCreamSundae = 2;
        int weightIceCreamSundae = 100;
        int rawEggs = 4;
        int weightRawEggs = 70;
        int weightfOffAllProducts = banana * weightBanana + milk * weightMilk + iceCreamSundae * weightIceCreamSundae + rawEggs * weightRawEggs;
        float weightfOffAllProductsKg = weightfOffAllProducts / 1000f;
        System.out.println("Вес спорт-завтрака " + weightfOffAllProducts + " гр.");
        System.out.println("Вес спорт-завтрака " + weightfOffAllProductsKg + " кг.");

        // Задача 4
        int weight = 7000;
        int loseWeight250 = 250;
        int loseWeight500 = 500;
        int days250 = weight / loseWeight250;
        int days500 = weight / loseWeight500;
        System.out.println("Если сбрасывать по 250 гр. в день, то спортсмену понадобиться " + days250 + " дней");
        System.out.println("Если сбрасывать по 500 гр. в день, то спортсмену понадобиться " + days500 + " дней");

        // Задача 5
        float ratio1 = 0.1f;
        float ratio2 = 1.1f;
        int months = 12;
        int Masha = 67760;
        int Denis = 83690;
        int Cristina = 76230;
        float DiffMasha = ratio1 * Masha * months;
        float DiffDenis = ratio1 * Denis * months;
        float DiffCristina = ratio1 * Cristina * months;
        System.out.println("Маша теперь получает " +  Masha * ratio2 + " рублей. Годовой доход вырос на " + DiffMasha + " рублей");
        System.out.println("Денис теперь получает " +  Denis * ratio2 + " рублей. Годовой доход вырос на " + DiffDenis + " рублей");
        System.out.println("Кристина теперь получает " +  Cristina * ratio2 + " рублей. Годовой доход вырос на " + DiffCristina + " рублей");


    }
}
