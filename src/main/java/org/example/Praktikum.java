package org.example;

public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.

             В классе Praktikum тебе нужно создать переменную со строкой, которая содержит имя и фамилию. После — создать экземпляр класса Account.
Чтобы задать условие для проверки, вызови метод checkNameToEmboss().


         */

        String cardHolderName = new String("F  d");

        Account account = new Account(cardHolderName);
        boolean canEmboss = account.checkNameToEmboss();
        //System.out.println("|" + cardHolderName + "| is " + canEmboss);


    }

}