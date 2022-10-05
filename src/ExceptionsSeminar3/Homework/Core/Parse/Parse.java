package ExceptionsSeminar3.Homework.Core.Parse;

import ExceptionsSeminar3.Homework.Core.Exceptions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parse {

    public String parse(String enteredUserData) {
        if (enteredUserData.isEmpty())
            throw new EmptyException();
        char[] symbols = enteredUserData.toCharArray();
        int lengthPhoneNumber = 8,
                symbolsLength = symbols.length;
        String FIOData,
                DateOfBirthData,
                PhoneNumberData,
                GenderData;

        //Pattern patternFIO = Pattern.compile("([A-Z][a-z]{1,20})\\s([A-Z][a-z]{1,20})\\s([A-Z][a-z]{1,20})"); English
        Pattern patternFIO = Pattern.compile("(?U)([A-Я][а-я]{1,20})\\s([А-Я][а-я]{1,20})\\s([А-Я][а-я]{1,20})");
        Matcher matcherFIO = patternFIO.matcher(enteredUserData);
        if (matcherFIO.find()) {
            FIOData = enteredUserData.substring(matcherFIO.start(), matcherFIO.end());
        } else
            throw new WrongFIOFormatException();

        Pattern patternDateOfBirth = Pattern.compile("(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})|(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))|(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})");
        Matcher matcherDateOfBirth = patternDateOfBirth.matcher(enteredUserData);
        if (matcherDateOfBirth.find()) {
            DateOfBirthData = enteredUserData.substring(matcherDateOfBirth.start(), matcherDateOfBirth.end());
            if (DateOfBirthData.contains("/")) {
                throw new WrongDateFormatException("Separate with '.' instead of '/'");
            }
            if (DateOfBirthData.contains("-"))
                throw new WrongDateFormatException("Separate with '.' instead of '-'");
            if (DateOfBirthData.length() < 10)
                throw new WrongDateFormatException("Incorrect division to indicate the day, month, year.");
        } else
            throw new WrongDateFormatException("Something went wrong");

        Pattern patternPhoneNumber = Pattern.compile("(\\+7|8)(\\d{10})|(\\d{11})");
        Matcher matcherPhoneNumber = patternPhoneNumber.matcher(enteredUserData);
        if (matcherPhoneNumber.find()) {
            PhoneNumberData  = enteredUserData.substring(matcherPhoneNumber.start(), matcherPhoneNumber.end());
            if (PhoneNumberData.contains("+"))
                throw new WrongFormatPhoneNumber("don't use '+' only numbers");
            if (PhoneNumberData.length() > 11)
                throw new WrongFormatPhoneNumber("Phone number very long");
        } else
            throw new WrongFormatPhoneNumber("Specify full number");

        Pattern patternGender = Pattern.compile("(f|m)");
        Matcher matcherGender = patternGender.matcher(enteredUserData);
        if (matcherGender.find()) {
            GenderData = enteredUserData.substring(matcherGender.start(), matcherGender.end());
        } else
            throw new WrongFormatGender("Specify one letter 'f' if female or 'm' if male");

        return "<" + FIOData.replace(" ", "><") + "><" + DateOfBirthData  + "><" + PhoneNumberData + "><" + GenderData + ">";
    }

    public String getSurname(String text) {
        String surname = "";
        Pattern patternSurname = Pattern.compile("(?<=\\<)(.*?)(?=\\>)");
        Matcher matcherSurname = patternSurname.matcher(text);
        if (matcherSurname.find()) {
            surname = text.substring(matcherSurname.start(), matcherSurname.end());
        }

        return surname;
    }
}
