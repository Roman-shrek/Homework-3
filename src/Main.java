public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte box = 8;
        System.out.println("Значение переменной с типом byte равно " + box);
        short apple = 130;
        System.out.println("Значение переменной с типом short равно " + apple);
        int banana = 1000;
        System.out.println("Значение переменной с типом int равно " + banana);
        long day = 350L;
        System.out.println("Значение переменной с типом long равно " + day);
        float pepper = 3.17f;
        System.out.println("Значение переменной с типом float равно " + pepper);
        double cucumber = 25.125;
        System.out.println("Значение переменной с типом double равно " + cucumber);
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short i = -159;
        int f = 27897;
        byte j = 67;
        System.out.println("Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int totalStudents = class1 + class2 + class3;
        short totalList = 480;
        int peopleList = totalList / totalStudents;
        System.out.println("На каждого ученика рассчитано " + peopleList + " листов бумаги");
        System.out.println("Задача 4");
        byte bottle = 16;
        byte times = 2;
        int bottleOneMinute = bottle / times;
        int bottleTwentyMinute = bottleOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottleTwentyMinute + " штук бутылок");
        int bottlesPerDay = bottleOneMinute * 1440;
        System.out.println("За 1 сутки машина произвела " + bottlesPerDay + " штук бутылок");
        int bottlesThreeDay = bottlesPerDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesThreeDay + " штук бутылок");
        int bottlesMonth = bottlesPerDay * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesMonth + " штук бутылок");
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte whiteCan1 = 2;
        byte brownCan1 = 4;
        int canClass1 = whiteCan1 + brownCan1;
        int totalClass = totalCans / canClass1;
        int totalWhiteCan = whiteCan1 * totalClass;
        int totalBrownCan = brownCan1 * totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhiteCan + " банок белой краски и " + totalBrownCan + " банок коричневой краски");
        System.out.println("Задача 6");
        byte bananaWeight1 = 80;
        byte milk100 = 105;
        byte iceCream1 = 100;
        byte egg1 = 70;
        int bananaWeight5 = bananaWeight1 * 5;
        int milk200 = milk100 * 2;
        int iceCream2 = iceCream1 * 2;
        int egg4 = egg1 * 4;
        int breakfastWeight = bananaWeight5 + milk200 + iceCream2 + egg4;
        float breakfastWeightKg = (float) breakfastWeight / 1000;
        System.out.println("Вес спортзавтрака в граммах " + breakfastWeight);
        System.out.println("Вес спортзавтрака в КГ " + breakfastWeightKg);
        System.out.println("Задание 7");
        byte targetWeight = 7;
        int target1 = 250;
        int target2 = 500;
        float target1Kg = target1 / 1000f;
        float target2Kg = target2 / 1000f;
        float day250Grams = (float) targetWeight / target1Kg;
        float day500Grams = (float) targetWeight / target2Kg;
        System.out.println("Если худеть по 250 грамм в день, то потребуется " + day250Grams + " дней");
        System.out.println("Если худеть по 500 грамм в день, то потребуется " + day500Grams + " дней");
        float result = (day250Grams + day500Grams) / 2;
        System.out.println("в среднем потребуется " + result + " день");
        System.out.println("Задание 8");
        int salaryMasha = 67760;
        int salaryDen = 83690;
        int salaryKris = 76230;
        float resultSalaryMasha = salaryMasha * 1.1f;
        float resultSalaryDen = salaryDen * 1.1f;
        float resultSalaryKris = salaryKris * 1.1f;
        float differenceMasha = (resultSalaryMasha * 12) - (salaryMasha * 12);
        float differenceDen = (resultSalaryDen * 12) - (salaryDen * 12);
        float differenceKris = (resultSalaryKris * 12) - (salaryKris * 12);
        System.out.println("Маша теперь получает " + resultSalaryMasha + " рубля. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + resultSalaryDen + " рубля. Годовой доход вырос на " + differenceDen + " рублей");
        System.out.println("Кристина теперь получает " + resultSalaryKris + " рубля. Годовой доход вырос на " + differenceKris + " рублей");
    }
}