package ExceptionSeminar3;

public class Ex {
    public static void main(String[] args) {
        try {
        giveMeArray(new String[][]{new String[]{"1", "2", "3", "4"},
                                    new String[]{"1", "2", "3", "4"},
                                    new String[]{"1", "2", "3", "4"},
                                    new String[]{"1b", "2", "3", "4"}});
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void giveMeArray(String[][] arrS) throws MyArrayDataException, MyArraySizeException{
        if (arrS.length != 4 && arrS[0].length != 4) {
            throw new MyArraySizeException();
        }

        int result = 0;

        for (String[] rows : arrS) {
            for (String column : rows) {
                try {
                    result += Integer.parseInt(column);
                } catch (MyArrayDataException e) {
                    throw new MyArraySizeException();
                }
            }
        }
        System.out.println(result);
    }
}


