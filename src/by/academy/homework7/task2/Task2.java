package by.academy.homework7.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;


public class Task2 {

    public static void main(String[] args) {
        User user = new User("Alexandr", "Dailid", 19, LocalDate.of(2003, Month.JULY, 17),
                "alexmsq", "212qwwqwq44", "al2003d@gmail.com");
        Class<User> userClass = User.class;
        user.printUserInfo();

        System.out.println("Methods class User: ");
        Method[] userClassMethods = userClass.getMethods();
        for (Method m : userClassMethods) {
            System.out.println(m);
        }
        System.out.println(" ");

        System.out.println("Fields class User: ");
        Field[] userClassFields = userClass.getFields();
        for (Field f : userClassFields) {
            System.out.println(f);
        }
        System.out.println(" ");

            try {
                Method userClassMethod = userClass.getMethod("printUserInfo");
                Field userClassField = userClass.getField("email");
                System.out.println("method + name");
                System.out.println(userClassMethod);

                System.out.println("\nfield + name");
                System.out.println(userClassField);

                Method userClassDeclaredMethod = userClass.getDeclaredMethod("printUserInfo");
                Method[] userClassDeclaredMethods = userClass.getDeclaredMethods();
                Field userClassDeclaredField = userClass.getDeclaredField("password");
                Field[] userClassDeclaredFields = userClass.getDeclaredFields();
                System.out.println("\nDeclared method + name: ");
                System.out.println(userClassDeclaredMethod );
                System.out.println("\nDeclared methods in Class User: ");
                System.out.println(Arrays.toString(userClassDeclaredMethods));
                System.out.println("\nDeclared field + name: ");
                System.out.println(userClassDeclaredField);
                System.out.println("\nDeclared fields in Class User: ");
                System.out.println(Arrays.toString(userClassDeclaredFields));

                Field userFirstName = User.class.getSuperclass().getDeclaredField("firstName");
                userFirstName.setAccessible(true);
                userFirstName.set(user, "Travis");

                Field userLastName = User.class.getSuperclass().getDeclaredField("lastName");
                userLastName.setAccessible(true);
                userLastName.set(user, "Pastrana");

                Field userDateOfBirth = User.class.getSuperclass().getDeclaredField("dateOfBirth");
                userDateOfBirth.setAccessible(true);
                userDateOfBirth.set(user, LocalDate.of(1983, Month.OCTOBER, 8));

                Field userAge = User.class.getSuperclass().getDeclaredField("age");
                userAge.setAccessible(true);
                userAge.set(user, Period.between
                        (LocalDate.of(1983, Month.OCTOBER, 8), LocalDate.now()).getYears());

                Field userLogin = userClass.getDeclaredField("login");
                userLogin.setAccessible(true);
                userLogin.set(user, "pastranaofficial");

                Field userPassword = userClass.getDeclaredField("password");
                userPassword.setAccessible(true);
                userPassword.set(user, "TrtrtR073");

                Field userEmail = userClass.getDeclaredField("email");
                userEmail.setAccessible(true);
                userEmail.set(user, "travispr@gmail.com");

                System.out.println(" ");
                Method userInfo = userClass.getDeclaredMethod("printUserInfo");
                userInfo .invoke(user);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
                e.printStackTrace();
            }


    }
}

