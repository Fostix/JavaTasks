package seminar4Homework;

public class Egg extends Food{

    protected int piecesPerPack;


    /**
     * Создать
     *
     * @param name           Название
     * @param price          Цена
     * @param count          Количество
     * @param magnitude      Единица измерения
     * @param expirationDate Срок годности
     * @param piecesPerPack Штук в упаковке
     */
    public Egg(String name, double price, double count, String magnitude, String expirationDate, int piecesPerPack) {
        super(name, price, count, magnitude, expirationDate);
        this.piecesPerPack = piecesPerPack;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Штук в упаковке: %d", this.piecesPerPack);
    }
}
