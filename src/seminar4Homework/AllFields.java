package seminar4Homework;

public class AllFields extends BaseProduct{

    protected int minimumAge;
    protected boolean hypoallergenic;
    protected String typeOfFlour;
    protected String size;
    protected int minimumWeight;
    protected int maximumWeight;
    protected String type;
    protected int piecesPerPack;
    protected String expirationDate;
    protected int fat;
    protected int numberOfLayers;

    /**
     * Создать
     *
     * @param name                 Название
     * @param price                Цена
     * @param count                Вес
     * @param magnitude            Единица измерения
     * @param minimumAge           Минимальный возраст
     * @param hypoallergenic       Гипоаллергенный
     * @param expirationDate       Срок годности
     * @param typeOfFlour          Тип муки
     * @param piecesPerPack        Штук в упаковке
     * @param size                 Размер
     * @param minimumWeight        Минимальный вес
     * @param maximumWeight        Максимальный вес
     * @param type                 тип
     * @param fat                  жирность
     * @param numberOfLayers       Количество слоёв
     *
     */
    public AllFields(String name, double price, double count, String magnitude,
                     int minimumAge, boolean hypoallergenic, String typeOfFlour,
                     String size, int minimumWeight, int maximumWeight,
                     String type, int piecesPerPack, String expirationDate,
                     int fat, int numberOfLayers) {
        super(name, price, count, magnitude);
        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
        this.expirationDate = expirationDate;
        this.typeOfFlour = typeOfFlour;
        this.piecesPerPack = piecesPerPack;
        this.size = size;
        this.minimumWeight = minimumWeight;
        this.maximumWeight = maximumWeight;
        this.type = type;
        this.fat = fat;
        this.numberOfLayers = numberOfLayers;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" , Минимальный возраст: %d, гипоаллергенный: %b," +
                " срок годности: %s \nтип муки: %s, в упаковке: %d штук, размер: %s, минимальный вес %dграмм, максимальный вес: %d," +
                        "тип: %s,\nжирность: %d",
                this.minimumAge, this. hypoallergenic, this.expirationDate, this.typeOfFlour,
                this.piecesPerPack, this.size, this.minimumWeight, this.maximumWeight, this.type, this.fat)
                + "%, " + String.format("количество слоёв: %d.", this.numberOfLayers);
    }
}
