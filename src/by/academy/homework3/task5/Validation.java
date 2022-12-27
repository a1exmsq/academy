package by.academy.homework3.task5;

public class Validation {

    public static void main(String[] args) {
        Validator a = new AmericanPhoneValidator();
        Validator b = new BelarusPhoneValidator();
        Validator eMail = new EmailValidator();

        System.out.println("+375291000000: " + b.validate("+375291000000"));
    }
}
