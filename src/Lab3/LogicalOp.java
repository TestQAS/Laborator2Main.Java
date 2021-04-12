package Lab3;

public class LogicalOp {

    public int checkBiggerNumber(int first, int second) {


        if (first > second) {

            return first;

        } else {

            return second;

        }
    }

    public String textCompare(String text) {

        if (text.equals("FastTrackIT")) {
            System.out.println("LearningTextComparison");
        } else if (!text.equals("FastTrackIT")) {

            System.out.println("Got to try some more");
        }
        return "";
    }

    public String textAndNumber(String text, int number) {

        if (text.equals("FastTrackIT") && number <= 3) {
            return (text + " " + number);
        } else if (!text.equals("FastTrackIT") && number <= 4) {
            return (number + " " + text);
        }
        return "";
    }

    public String snowForecast(int centimeters) {

        if (centimeters > 8 || centimeters == 6) {

            System.out.println("The amount of snow this winter was(cm): " + centimeters);

        } else System.out.println("The forecast snow is(cm): " + centimeters);
        return "";
    }

    public String equalCheck(int number) {

        if (number > 3) {

            if (number < 4 || number > 4) {

                System.out.println("The number is greater than 3 and not equal to 4");
            } else {
                System.out.println("The number is equal to 4");

            }
        } else {
            System.out.println("The number is lower than 3");
        }
        return "";

    }

    public String outputnumber(int number) {

        switch (number) {
            case 10:
                System.out.println("The number is 10!");
                break;
            case 20:
                System.out.println("The number is 20!");
                break;
            case 30:
                System.out.println("The number is 30!");
                break;
            default:
                System.out.println("The number is not 30!");
        }
        return " ";
    }

    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(int number) {

        if (number >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int giveHigherNumb3r(int first, int second, int third) {

        if (first >= second && first >= third) {
            return first;
        } else if (second > first && second >= third) {
            return second;
        } else
            return third;

        }
    }

    //Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

