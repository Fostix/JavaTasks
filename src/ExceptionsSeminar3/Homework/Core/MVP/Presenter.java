package ExceptionsSeminar3.Homework.Core.MVP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(View view) {
        this.model = new Model();
        this.view = view;
    }

    public void add() {
        view.enter();
        String enteredUserData = view.readConsole();
        parse(enteredUserData);
    }

    private boolean parse(String enteredUserData) {
        enteredUserData += " ";
        boolean testGender = false;
        boolean testFIO = false;
        boolean testPhoineNumber = false;
        boolean testDateOfBirth = false;
        char[] symbols = enteredUserData.toCharArray();
        int lengthPhoneNumber = 8,
                symbolsLength = symbols.length;

        Pattern patternDate = Pattern.compile("(?:(?:31(\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})|(?:29(\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))|(?:0?[1-9]|1\\d|2[0-8])(\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})");
        Pattern patternFIO = Pattern.compile("([A-Z][a-z]{1,10})\\s([A-Z][a-z]{1,10})\\s([A-Z][a-z]{1,10})");
        Pattern patternPhoneNumber = Pattern.compile("\\d{11}\s"); // digit +7 can be start phone number
        Matcher matcherDate = patternDate.matcher(enteredUserData);
        Matcher matcherFIO = patternFIO.matcher(enteredUserData);
        Matcher matcherPhoneNumber = patternPhoneNumber.matcher(enteredUserData);
        if (matcherFIO.find()) {
            System.out.println(enteredUserData.substring(matcherFIO.start(), matcherFIO.end()) + " here search");
        }

        if (matcherDate.find()) {
            System.out.println(enteredUserData.substring(matcherDate.start(), matcherDate.end()) + " here search");
        }

        if (matcherPhoneNumber.find()) {
            System.out.println(enteredUserData.substring(matcherPhoneNumber.start(), matcherPhoneNumber.end()) + " here search");
        }

        for (int i = 0; i < symbolsLength; i++) {

            if (symbols[i] == 'm' || symbols[i] == 'f') {
                testGender = true;
            }
            if ((symbols[i] == '+' || Character.isDigit(symbols[i])) && (!testPhoineNumber && i + lengthPhoneNumber < symbolsLength)) {
                String phoneNumber = String.valueOf(enteredUserData.substring(i, i + lengthPhoneNumber));
                //System.out.println(phoneNumber + " checkPhoneNumber");
                testPhoineNumber = checkValidNumberPhone(phoneNumber);
                testPhoineNumber = true;
            }
        }
        //System.out.println(text);
        return true; // if gender to only one symbol
        // if number without point then two numbers to data
        // if number +7 or 8 to number ok?
    }

    private boolean checkValidFIO() {
        return true;
    }

    private boolean checkValidGender() {
        return true;
    }

    private boolean CheckDateOfBirthForValidity() {
        return true;
    }

    private boolean checkValidNumberPhone(String text) {
        return true;
    }
}
