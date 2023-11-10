package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws UserInputException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new UserInputException("index not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] str = {"asd", "fgh", "jkl"};
            indexOf(str, "dsa");
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}