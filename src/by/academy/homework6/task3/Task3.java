package by.academy.homework6.task3;

import java.io.*;
import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Mikhail", "D", 31));
        users.add(new User("Alexandr", "M", 19));
        users.add(new User("Alexey", "K", 22));
        users.add(new User("Sergey", "D", 21));
        users.add(new User("Olga", "C", 44));
        users.add(new User("Maxim", "L", 18));
        users.add(new User("Irina", "S", 20));
        users.add(new User("Pavel", "R", 33));
        users.add(new User("Karina", "T", 32));
        users.add(new User("Nikita", "N", 50));

        File dirs = new File("src/by/academy/homework6/task3/users");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }
        for (User u : users) {
            File file = new File(dirs, u.getName() + "_" + u.getSurname() + ".txt");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
                 ObjectOutputStream oos = new ObjectOutputStream(bos)) {
                 oos.writeObject(u);
                 oos.flush();


            } catch (IOException ex) {
                System.err.println(ex.getMessage());

            }
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
                 ObjectInputStream ois = new ObjectInputStream(bis)) {
                u = (User) ois.readObject();
                System.out.println(u);


            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }


        }
    }
    }
