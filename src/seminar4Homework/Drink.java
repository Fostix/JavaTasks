package seminar4Homework;

public class Drink extends Food{

    /**
     * Создать
     *
     * @param name           Название
     * @param price          Цена
     * @param count          Количество
     * @param magnitude      Единица измерения
     * @param expirationDate Срок годности
     */
    public Drink(String name, double price, double count, String magnitude, String expirationDate) {

        super(name, price, count, magnitude, expirationDate);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
