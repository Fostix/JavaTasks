package seminar4Homework;

public class ToiletPaper extends BaseProduct{

    protected int numberOfLayers;

    /**
     * Создать
     *
     * @param name      Название
     * @param price     Цена
     * @param count     Количество
     * @param magnitude Единица измерения
     * @param numberOfLayers Количество слоёв
     */
    public ToiletPaper(String name, double price, double count, String magnitude, int numberOfLayers) {
        super(name, price, count, magnitude);
        this.numberOfLayers = numberOfLayers;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", количество слоёв: %d слоя.", this.numberOfLayers);
    }
}
