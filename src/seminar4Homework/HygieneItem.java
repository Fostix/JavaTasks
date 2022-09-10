package seminar4Homework;

public class HygieneItem extends BaseProduct {
    protected int piecesPerPack;


    /**
     * Создать
     * @param name      Название
     * @param price     Цена
     * @param count     Количество
     * @param magnitude Единица измерения
     * @param piecesPerPack Штук в упаковке
     */
    public HygieneItem(String name, double price, int count, String magnitude, int piecesPerPack) {
        super(name, price, count, magnitude);
        this.piecesPerPack = piecesPerPack;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", количество %d штук.", this.piecesPerPack);
    }
}
