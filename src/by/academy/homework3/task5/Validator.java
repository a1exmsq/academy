package by.academy.homework3.task5;

import java.util.regex.Pattern;

public interface Validator {

    Pattern getPattern();
    default boolean validate(String str){
        return getPattern().matcher(str).matches();
    }



}
