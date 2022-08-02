public class HW3 {
    public static void main(String[] agrs){
        //Задача 1
        byte a = 100;
        short b = 1000;
        int c = 10000;
        long d = 100000L;
        float e = 2.5f;


       //Задача 2
        float FirstBoxer = 78.2f;
        float SecondBoxer = 82.7f;
        float BoxesrWeight = FirstBoxer + SecondBoxer;
        System.out.println("Общий вес двух боксеров равен " + BoxesrWeight + "кг!");
        float BoxersWeightDifference = SecondBoxer - FirstBoxer;
        System.out.println("Разница в весе у двух боксеров " + BoxersWeightDifference + "кг!");


        //Задача 3
        int BananaWeight = 400;
        int MilkWeight = 210;
        int IceCreamWeight = 200;
        int EggWeight = 210;
        int TotalWeight = BananaWeight + MilkWeight + IceCreamWeight + EggWeight;
        System.out.println("Вес такого спорт-завтрака состовляет " + TotalWeight + "гр!");
        float kg = 1000f;
        float WeightInKg = TotalWeight / kg;
        System.out.println("Вес такого спорт-завтрака в киллограммах состовляет " + WeightInKg + "кг!");


        //Задача 4
        int SportsmanWeight = 7;
        float FirstOption = 250 / kg;
        float SecondOption = 500 / kg;
        float FirstWeight = SportsmanWeight / FirstOption;
        System.out.println("Если спортсмен будет худеть на 250 грамм ежедневно, то ему понадопится " + FirstWeight + " дней для достижения своей цели!");
        float SecondWeight = SportsmanWeight / SecondOption;
        System.out.println("Если спортсмен будет худеть на 500 грамм ежедневно, то ему понадопится " + SecondWeight + " дней для достижения своей цели!");
        float Avage = (FirstWeight + SecondWeight) / 2;
        System.out.println("В среднем может понадобится " + Avage + " день, чтобы добиться результата похудерия!");


        //Задача 5
        int MashaSalary = 67760;
        int DenisSalarys = 83690;
        int ChristinaSalarys = 76230;
        float Procent = 0.1f;
        float MashaPromotion = (MashaSalary + ( MashaSalary * Procent));
        float MashaNewIncome = ((MashaPromotion * 12) - (MashaSalary * 12));
        System.out.println("Маша теперь получает " + MashaPromotion + " рублей. Годовой доход вырос на " + MashaNewIncome + " рубль");
        float DenisPromotion = (DenisSalarys + ( DenisSalarys * Procent));
        float DenisNewIncome = ((DenisPromotion * 12) - (DenisSalarys * 12));
        System.out.println("Денис теперь получает " + DenisPromotion + " рублей. Годовой доход вырос на " + DenisNewIncome + " рубль");
        float ChristinaPromotion = (ChristinaSalarys + ( ChristinaSalarys * Procent));
        float ChristinaNewIncome = ((ChristinaPromotion * 12) - (ChristinaSalarys * 12));
        System.out.println("Кристина теперь получает " + ChristinaPromotion + " рублей. Годовой доход вырос на " + ChristinaNewIncome + " рубль");

    }
}
