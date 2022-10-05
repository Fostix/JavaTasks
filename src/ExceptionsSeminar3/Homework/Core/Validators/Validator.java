package ExceptionsSeminar3.Homework.Core.Validators;

public class Validator {
    private String data;

    public Validator(String data) {
        this.data = data;
    }

    /** checks for a sequence of absence and presence of a space*/
    public int checkValidCount() {
        int count = 0,
                rightAmountOfData = 6;
        boolean checkSpace = true;

        for (Character symbol : data.toCharArray()) {
            if (symbol.equals(' ')) {
                checkSpace = true;
            }
            if (symbol != ' ' && checkSpace) {
                checkSpace = false;
                count++;
            }
        }

        if (count < rightAmountOfData)
            return -1;
        else if (count > rightAmountOfData)
            return -2;
        return 0;
    }
}
