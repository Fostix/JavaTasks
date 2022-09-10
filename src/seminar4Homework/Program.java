package seminar4Homework;

public class Program {
    public static void main(String[] args) {

        BaseProduct product = new BaseProduct("Бумага", 999.99, 5, "кг");
        System.out.println(product);

        BaseProduct product1 = new Food("Рис", 69.99, 600, "грамм", "19.06.2022");
        System.out.println(product1);

        BaseProduct product2 = new Drink("Cola", 129.99, 2, "литр", "19.06.2022");
        System.out.println(product2);

        BaseProduct product3 = new HygieneItem("Ушные алибардочки", 99.99, 1, "грамм", 50);
        System.out.println(product3);

        BaseProduct product4 = new BabyProducts("Детская еда", 299.99, 500, "грамм", 0, true);
        System.out.println(product4);

        BaseProduct product5 = new Milk("Молоко", 69.99, 0.5, "литр", "19.06.2022", 5);
        System.out.println(product5);

        BaseProduct product6 = new Lemonade("Mr Lemonade", 79.99, 1, "литр", "20.05.2023");
        System.out.println(product6);

        BaseProduct product7 = new Bread("У зернышка", 69.99, 400, "грамм", "19.06.2022", "пшеничная");
        System.out.println(product7);

        BaseProduct product8 = new Egg("Курятник в домике", 99.99, 700, "грамм", "30.06.2022", 10);
        System.out.println(product8);

        BaseProduct product9 = new Mask("Зеленая маска", 99.99, 100, "грамм");
        System.out.println(product9);

        BaseProduct product10 = new ToiletPaper("Подтирашка", 99.99, 500, "грамм", 2);
        System.out.println(product10);

        BaseProduct product11 = new Diapers("Надгузник", 499.99, 500, "грамм", 5, "xl", 300, 900, "Детский");
        System.out.println(product11);

        BaseProduct product12 = new Pacifler("Моска", 150.99, 50, "грамм", 0, true);
        System.out.println(product12);

        BaseProduct product13 = new AllFields("Тест", 9.9, 1000,
                "грамм", 18, true, "пшеничная",
                "xxl", 1, 1000, "совершеннолетним", 12, "19.06.2100", 0, 2);
        System.out.println(product13);

    }
}