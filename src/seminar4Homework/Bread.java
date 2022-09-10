package seminar4Homework;

public class Bread extends Food{

    protected String typeOfFlour;

    /**
     * Создать
     *
     * @param name           Название
     * @param price          Цена
     * @param count          Количество
     * @param magnitude      Единица измерения
     * @param expirationDate Срок годности
     * @param typeOfFlour    Тип муки
     */
    public Bread(String name, double price, double count, String magnitude, String expirationDate, String typeOfFlour) {
        super(name, price, count, magnitude, expirationDate);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Тип муки: %s.", this.typeOfFlour);
    }
}
