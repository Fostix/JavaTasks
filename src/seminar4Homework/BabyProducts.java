package seminar4Homework;

public class BabyProducts extends BaseProduct{

    protected int minimumAge;
    protected boolean hypoallergenic;

    /**
     * Создать
     *
     * @param name      Название
     * @param price     Цена
     * @param count     Количество
     * @param magnitude Единица измерения
     * @param minimumAge Минимальный возраст
     * @param hypoallergenic Гипоаллергенный
     */
    public BabyProducts(String name, double price, int count, String magnitude, int minimumAge, boolean hypoallergenic) {
        super(name, price, count, magnitude);
        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", минимальный возраст: %d, гипоаллергенный: %b", this.minimumAge, this.hypoallergenic);
    }
}
