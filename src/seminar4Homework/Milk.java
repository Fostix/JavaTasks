package seminar4Homework;

public class Milk extends Drink{

    protected int fat;


    /**
     * Создать
     *
     * @param name           Название
     * @param price          Цена
     * @param count          Количество
     * @param magnitude      Единица измерения
     * @param expirationDate Срок годности
     * @param fat жирность
     */
    public Milk(String name, double price, double count, String magnitude, String expirationDate, int fat) {
        super(name, price, count, magnitude, expirationDate);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", жирность %d", this.fat) + "%";
    }
}
