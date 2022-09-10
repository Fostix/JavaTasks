package seminar4Homework;

public class Food extends BaseProduct{

    protected String expirationDate;

    /**
     * Создать
     *
     * @param name      Название
     * @param price     Цена
     * @param count     Количество
     * @param magnitude Единица измерения
     * @param expirationDate Срок годности
     */
    public Food(String name, double price, double count, String magnitude, String expirationDate) {
        super(name, price, count, magnitude);
        this.expirationDate = expirationDate;
    }


    @Override
    public String toString() {
        return super.toString() + String.format(", Годен до: %s", this.expirationDate);
    }
}
