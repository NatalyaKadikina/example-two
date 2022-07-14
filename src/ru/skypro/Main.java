package ru.skypro;

public class Main {

    public static void main(String[] args) {


        // Задача 1
        byte cat = 1;
        short mouse = 3;
        int dog = 7;
        long elephant = 110L;

        float saltWeight = 1.5f;
        double sugarWeight = 4.5;

        boolean dogIsAdult = true;
        char c = 'c';

        // Задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;

        double weightOffAllBoxers = boxer1 + boxer2;
        double weightDifference = Math.abs(boxer1 - boxer2);

        System.out.println("Общий вес боксеров " + weightOffAllBoxers);
        System.out.println("Разница в весе боксеров " + weightDifference);

        // Задача 3
        int banana = 5;
        int weightBanana = 80;

        int milk = 200 / 100;
        int weightMilk = 105;

        int iceCreamSundae = 2;
        int weightIceCreamSundae = 100;

        int rawEggs = 4;
        int weightRawEggs = 70;

        int total = (banana * weightBanana) + (milk * weightMilk) + (iceCreamSundae * weightIceCreamSundae) + (rawEggs * weightRawEggs);

        int gramsInKg = 1000;

        double totalKg = total / (gramsInKg * 1.0);

        System.out.println("Вес спорт-завтрака " + totalKg + " кг.");

        // Задача 4
        int weight = 7;
        int gramInKg = 1000;
        int weightGramInKg = weight * gramInKg;

        int minGramsPerDay = 250;
        int maxGramsPerDey = 500;

        int minDays = weightGramInKg / maxGramsPerDey;
        int maxDays = weightGramInKg / minGramsPerDay;

        int avgDays = (minDays + maxDays) / 2;

        System.out.println("Если сбрасывать по 250 гр. в день, то спортсмену понадобиться " + minDays + " дней");
        System.out.println("Если сбрасывать по 500 гр. в день, то спортсмену понадобиться " + maxDays + " дней");
        System.out.println("Среднее значение: " + avgDays + " дней");

        // Задача 5
        int percent = 10;
        double mulyiplier = percent / (100 * 1.0);

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int mashaNewSalary = (int) (mashaSalary + (mashaSalary * mulyiplier));
        int denisNewSalary = (int) (denisSalary + (denisSalary * mulyiplier));
        int kristinaNewSalary = (int) (kristinaSalary + (kristinaSalary * mulyiplier));

        int mashaDifference = (mashaNewSalary - mashaSalary) * 12;
        int denisDifference = (denisNewSalary - denisSalary) * 12;
        int kristinsDifference = (kristinaNewSalary - kristinaSalary) * 12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinsDifference + " рублей");
    }
}

