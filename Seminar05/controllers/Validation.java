package JAVA_OOP.Seminar05.controllers;

import java.util.regex.Pattern;

import JAVA_OOP.Seminar05.model.User;

public class Validation {
    public void validate(User user) {
        if (!pattern.matcher(user.getFirstName()).find()) {
            throw new RuntimeException("Поле Имя не может быть пустым");
        }
        if (!pattern.matcher(user.getLastName()).find()) {
            throw new RuntimeException("Поле Фамилияне может быть пустым");
        }
        if (!pattern.matcher(user.getPhone()).find()) {
            throw new RuntimeException("Поле Номер телефона не может быть пустым");
        }
        if (!patternDigit.matcher(user.getPhone()).find()) {
            throw new RuntimeException("Номер телефона должен модержать только цифры");
        }
    }

    final String regex = "^\\S+$";
    final String digit = "^\\d+$";
    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    final Pattern patternDigit = Pattern.compile((digit));
}