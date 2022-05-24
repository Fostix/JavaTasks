package seminar1Task1;

import java.io.BufferedReader;
import java.io.FileReader;


public class MyInputTxt {
    static void FillArrayx(String str, int[] arr, boolean num){
        String reading = "";
        int length = str.length();
        for (int i = 1; i < length; i++) {
            if (str.charAt(i) == '-' || Character.isDigit(str.charAt(i))) {
                reading += Character.toString(str.charAt(i));
            }
        }
        arr[num ? 1 : 0] = Integer.parseInt(reading);
    }

    public static int[] ReaderMethod() throws Exception {
        int[] arr = new int[2];
        BufferedReader br = new BufferedReader(new FileReader("src/seminar1Task1/txtFiles/input.txt"));
        String str;
        boolean checkA = true;
        boolean checkB = true;

        byte counter = 0;
        while ((str = br.readLine()) != null) {
            int length = str.length();
            if (checkA && str.charAt(0) == 'a') {
                FillArrayx(str, arr,false);
                checkA = false;
            } else if (checkB && str.charAt(0) == 'b') {
                FillArrayx(str, arr,true);
                checkB = false;
            }
        }
        br.close();
        return arr;
    }
}







