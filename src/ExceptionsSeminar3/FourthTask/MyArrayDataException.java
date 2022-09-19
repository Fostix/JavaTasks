package ExceptionsSeminar3.FourthTask;

import java.util.List;

public class MyArrayDataException extends RuntimeException{
    private List<Integer> log;
    public MyArrayDataException(List<Integer> log) {
        this.log = log;
    }

    @Override
    public String getMessage() {
        StringBuilder info = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < log.size(); i++) {
            if (flag) {
                info.append("(Row " + String.valueOf(log.get(i)) + " ");
                flag = false;
            }
            else {
                info.append("Column " + String.valueOf(log.get(i)) + ")");
                flag = true;
                if (log.size() != i+1) {
                    info.append(", ");
                }
                else
                    info.append(".");
            }
        }
        return "In array not number: " + info;
    }
}
