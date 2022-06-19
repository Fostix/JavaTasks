package seminar4Homework;

public class Diapers extends HygieneItem{

    protected String size;
    protected int minimumWeight;
    protected int maximumWeight;
    protected String type;


    /**
     * Создать
     *
     * @param name          Название
     * @param price         Цена
     * @param count         Количество
     * @param magnitude     Единица измерения
     * @param piecesPerPack Штук в упаковке
     * @param size          Размер
     * @param minimumWeight Минимальный вес
     * @param maximumWeight Максимальный вес
     * @param type          Тип
     */
    public Diapers(String name, double price, int count, String magnitude, int piecesPerPack, String size, int minimumWeight, int maximumWeight, String type) {
        super(name, price, count, magnitude, piecesPerPack);
        this.size = size;
        this.minimumWeight = minimumWeight;
        this.maximumWeight = maximumWeight;
        this.type = type;
    }


    @Override
    public String toString() {
        return super.toString() + String.format(", размер %s, минимальный вес: %d, максимальный вес: %d, тип: %s.", this.size, this.minimumWeight, this.maximumWeight, this.type);
    }
}
