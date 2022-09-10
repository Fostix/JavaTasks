package seminar4Homework;

public class Pacifler extends BabyProducts{
    /**
     * Создать
     *
     * @param name           Название
     * @param price          Цена
     * @param count          Количество
     * @param magnitude      Единица измерения
     * @param minimumAge     Минимальный возраст
     * @param hypoallergenic Гипоаллергенный
     */
    public Pacifler(String name, double price, int count, String magnitude, int minimumAge, boolean hypoallergenic) {
        super(name, price, count, magnitude, minimumAge, hypoallergenic);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
