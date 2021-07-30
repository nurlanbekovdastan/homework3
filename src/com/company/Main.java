package com.company;

public class Main {

    public static void main(String[] args) {

     String[] names = new String[4];
     names[0] = "Dastan";
     names[1] = "Nurba";
     names[2] = "Bakyt";
     names[3] = "Erjan";


        for (int i = 0; i < 4; i++) {

            switch (names[i]){
                case "Dastan":
                    System.out.println("Доброе утро Дастан");
                    break;
                case "Nurba":
                    System.out.println("Добрый день Nurba");
                    break;
                case "Bakyt":
                    System.out.println("Добрый вечер Бакыт");
                    break;
                case "Erjan":
                    System.out.println("Привет " + names[3]);
                    break;


            }
            
        }

    }
}
