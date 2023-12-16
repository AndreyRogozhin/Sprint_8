package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.



В классе Account задай проверки: длина, наличие пробела в начале или конце строки.
 Используй методы класса String. Например, для проверки длины — name.length() >= 3.


Её получится напечатать, если соблюдены требования:
в строке не меньше 3 и не больше 19 символов,
в строке есть только один пробел,
пробел стоит не в начале и не в конце строки.


         */

        boolean result = true;

        if (name.startsWith(" "))
            result = false;
        else if (name.endsWith(" "))
            result = false;
        else if (name.length() < 3 || name.length() > 19)
            result = false;
        else if (name.indexOf(" ") == -1)
            result = false;
        else if (name.indexOf(" ") != name.lastIndexOf(" "))
            result = false;

        return result;
    }

}