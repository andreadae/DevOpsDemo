package ch.zhaw.iwi.devops.fizzbuzz;

public class GuessingGame {
    public String guess(int number) {
        System.out.println("Dein Guess ist" +number);
        if (number == 10){
            return "Das ist korrekt!";
        }
        else if (number > 12 && number <= 50){
            return "Deine Schätzung ist zu hoch";
        }

        else if (number < 8 && number >= 2) {
            return "Deine Schätzung ist zu tief";
        }

        else if (number < 0) {
            return "Die Eingabe muss eine Zahl wischen 1 und 100 sein";
        }

        else if (number > 100 && number < 42000) {
            return "Die Eingabe muss eine Zahl wischen 1 und 100 sein";
        }

        else if (number > 50 && number < 4200) {
            return "Deine Eingabe ist viel zu hoch";
        }

        else if (number == 1) {
            return "Mach es dir nicht so einfach";
        }

        else if (number == 9 || number == 11) {
            return "Du bist sehr nahe dran!";
        }

        else if (number == 8 || number == 12) {
            return "Du bist nahe dran!";
        }

        else if (number == 42000) {
            return "Du hast die Antwort auf alle Fragen mal 1000";
        }

        return "Das ist nicht die korrekte Eingabe";
    }

}
