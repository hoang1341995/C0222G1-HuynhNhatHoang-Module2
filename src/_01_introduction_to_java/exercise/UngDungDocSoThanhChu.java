package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class UngDungDocSoThanhChu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int donvi = number % 10;
        int chuc = number % 100 / 10;
        int tram = number / 100;

        if (number < 10 && number > 0) {
            System.out.println(uint(donvi));
        } else if (number < 20) {
            System.out.println(dacBiet(number));
        } else if (number < 100) {
            System.out.println(dozen(chuc) + " " + uint(donvi));
        } else if (number < 1000) {
            System.out.println(hundred(tram) + " " + dozen(chuc) + " " + uint(donvi));
        } else {
            System.out.println("out of ability");
        }

    }

    public static String uint(int number) {
        String str = "";
        switch (number) {
            case 1:
                str += "one";
                break;
            case 2:
                str += "two";
                break;
            case 3:
                str += "three";
                break;
            case 4:
                str += "four";
                break;
            case 5:
                str += "five";
                break;
            case 6:
                str += "six";
                break;
            case 7:
                str += "seven";
                break;
            case 8:
                str += "eight";
                break;
            case 9:
                str += "nine";
                break;
        }
        return str;
    }

    public static String dacBiet(int number) {
        String str = "";
        switch (number) {
            case 10:
                str += " ten";
                break;
            case 11:
                str += " eleven";
                break;
            case 12:
                str += " twelve";
                break;
            case 13:
                str += " thirteen";
                break;
            case 14:
                str += " fourteen";
                break;
            case 15:
                str += " fifteen";
                break;
            case 16:
                str += " sixteen";
                break;
            case 17:
                str += " seventeen";
                break;
            case 18:
                str += " eighteen";
                break;
            case 19:
                str += " nineteen";
                break;
        }
        return str;
    }

    public static String dozen(int number) {
        String str = "";
        switch (number) {

            case 2:
                str += "twenty";
                break;
            case 3:
                str += "thirty";
                break;
            case 4:
                str += "fourty";
                break;
            case 5:
                str += "fifty";
                break;
            case 6:
                str += "sixty";
                break;
            case 7:
                str += "seventy";
                break;
            case 8:
                str += "eighty";
                break;
            case 9:
                str += "ninety";
                break;
        }
        return str;
    }

    public static String hundred(int number) {
        String str = "";
        switch (number) {
            case 1:
                str += "one hundred";
                break;
            case 2:
                str += "two hundred";
                break;
            case 3:
                str += "three hundred";
                break;
            case 4:
                str += "four hundred";
                break;
            case 5:
                str += "five hundred";
                break;
            case 6:
                str += "six hundred";
                break;
            case 7:
                str += "seven hundred";
                break;
            case 8:
                str += "eight hundred";
                break;
            case 9:
                str += "nine hundred";
                break;
        }
        return str;
    }
}

