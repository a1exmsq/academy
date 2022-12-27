package by.academy.homework3.task5;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator{

    private static final Pattern p = Pattern.compile("\\+375((29)|(33)|(25))[0-9]{7}");
    @Override
    public Pattern getPattern() {
        return p;
    }

}
