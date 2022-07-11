public class Main {
    public static void main(String[] args) {
        System.out.println("Hello JavaPRO!");
        // Задание 1..
        System.out.println("Задание 1:");
        byte a = 1;
        short b = 10;
        int c = 100;
        long d = 500L;
        float e = 2.78f;
        double f = 4.5678;
        char g = 104;
        boolean h = c > 1;
        System.out.println(a + ", " + b + ", "+ c + ", " + d + ", " +  e + ", " + f + ", " + g + ", " + h);

        // Задание 2..
        System.out.println("Задание 2:");
        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;
        double boxerAll = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес бойцов " + boxerAll + "кг" );
        System.out.println("Разница в весе " + ( boxerAll - boxerWeight1 * 2 ) + "кг");

        // Задание 3..
        System.out.println("Задание 3:");
        int banana = 5;                         //количество бананов
        int banaWeight = 80;                    //вес банана
        int milk = 200;                         //количество молока
        double milkWeight = 105.0 / 100.0;
        int icecream = 2;
        int icecreamWeight = 100;
        int egg = 4;
        int eggWeight = 70;
        double allWeight = banana * banaWeight + milk * milkWeight + icecream * icecreamWeight + egg * eggWeight;
        System.out.println("Вес завтрака в граммах " + allWeight + "гр.");
        System.out.println("Вес завтрака в килограммах " + (allWeight / 1000) + "кг.");

        //Задание 4
        System.out.println("Задание 4:");
        int delWeight = 7 * 1000; // нужно сбросить грамм
        int minDay = delWeight / 500; // потребуется времени если худеть на 500грамм в день
        int maxDay = delWeight / 250; // потребуется времени  если худеть на 250грамм в день
        System.out.println("Минимальное время на похудение " + minDay + "дней");
        System.out.println("Максимальное время на похудение " + maxDay + "дней");

        //Задание 5
        System.out.println("Задание 5:");
        int salaryMariya = 67_760;        //Зарплата Марии в месяц
        int salaryDenis = 83_690;         //Зарплата Дениса в месяц
        int salaryKristina = 76_230;      //Зарплата Кристины в месяц
        int salaryMariyaup = (salaryMariya / 10) + salaryMariya;         //Зарплата после повышения на 10%
        int salaryDenisup = (salaryDenis / 10) + salaryDenis;            //Зарплата после повышения на 10%
        int salaryKristinaup = (salaryKristina / 10) + salaryKristina;   //Зарплата после повышения на 10%
        System.out.println(" Зарплата Марии после повышения составляет " + salaryMariyaup + "руб. Годовой доход вырос на " + ((salaryMariyaup * 12) - (salaryMariya * 12)) + "руб.");
        System.out.println(" Зарплата Дениса после повышения составляет " + salaryDenisup + "руб. Годовой доход вырос на " + ((salaryDenisup * 12) - (salaryDenis * 12)) + "руб.");
        System.out.println(" Зарплата Кристины после повышения составляет " + salaryKristinaup + "руб. Годовой доход вырос на "+ ((salaryKristinaup * 12) - (salaryKristina * 12)) + "руб.");



    }
}