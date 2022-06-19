package seminar4Homework;



public class BaseProduct {
    protected String productName;
    protected double productPrice;
    protected double count;
    protected String unitOfMeasurement;


    /**
     * Создать
     * @param name Название
     * @param price Цена
     * @param count Вес
     * @param magnitude Единица измерения
     */
    public BaseProduct(String name, double price, double count, String magnitude) {
        this.productName = name;
        this.productPrice = price;
        this.count = count;
        this.unitOfMeasurement = magnitude;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, цена: %.2f камней, вес: %.2f%s", this.productName, this.productPrice, this.count, this.unitOfMeasurement);

    }
}

//1. Название
//        2. Цена
//        3. Количество
//        4. Единица измерения