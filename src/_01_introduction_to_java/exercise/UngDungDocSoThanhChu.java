package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    static String checkNumber(int value) {
        String str1 = null;
        switch (value) {
            case 1:
                str1 = "one";
                break;
            case 2:
                str1 = "two";
                break;
            case 3:
                str1 = "three";
                break;
            case 4:
                str1 = "four";
                break;
            case 5:
                str1 = "five";
                break;
            case 6:
                str1 = "six";
                break;
            case 7:
                str1 = "seven";
                break;
            case 8:
                str1 = "eight";
                break;
            case 9:
                str1 = "night";
                break;
        }
        return str1;
    }

    static String checkNumber2(int number1, int number2) {
        String str1 = null;
        if (number1 == 0 && number2 == 0){
            str1 = "";
            return str1;
        }else {
            if (number2 > 0) {
                if (number2 == 1) {
                    switch (number2) {
                        case 1:
                            str1 = "eleven";
                            break;
                        case 2:
                            str1 = "Twelve";
                            break;
                        case 3:
                            str1 = "Thirteen";
                            break;
                        case 4:
                            str1 = "Fourteen";
                            break;
                        case 5:
                            str1 = "Fifteen";
                            break;
                        case 6:
                            str1 = "Sixteen";
                            break;
                        case 7:
                            str1 = "Seventeen";
                            break;
                        case 8:
                            str1 = "Eighteen";
                            break;
                        case 9:
                            str1 = "Nineteen";
                            break;
                    }
                    return str1;
                } else {
                    switch (number1) {
                        case 2:
                            str1 = "twenty ";
                            break;
                        case 3:
                            str1 = "thirty ";
                            break;
                        case 4:
                            str1 = "forty ";
                            break;
                        case 5:
                            str1 = "fifty ";
                            break;
                        case 6:
                            str1 = "sixty ";
                            break;
                        case 7:
                            str1 = "seventy ";
                            break;
                        case 8:
                            str1 = "eighty ";
                            break;
                        case 9:
                            str1 = "nighty ";
                            break;
                    }

                }
            } else {
                switch (number1) {
                    case 1:
                        str1 = "ten";
                        break;
                    case 2:
                        str1 = "twenty";
                        break;
                    case 3:
                        str1 = "thirty";
                        break;
                    case 4:
                        str1 = "forty";
                        break;
                    case 5:
                        str1 = "fifty";
                        break;
                    case 6:
                        str1 = "sixty";
                        break;
                    case 7:
                        str1 = "seventy";
                        break;
                    case 8:
                        str1 = "eighty";
                        break;
                    case 9:
                        str1 = "nighty";
                        break;
                }
                return str1;
            }
        }
        switch (number2) {
            case 1:
                str1 += "one";
                break;
            case 2:
                str1 += "two";
                break;
            case 3:
                str1 += "three";
                break;
            case 4:
                str1 += "four";
                break;
            case 5:
                str1 += "five";
                break;
            case 6:
                str1 += "six";
                break;
            case 7:
                str1 += "seven";
                break;
            case 8:
                str1 += "eight";
                break;
            case 9:
                str1 += "night";
                break;
        }
        return str1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.parseInt(scanner.nextLine());
        if (number > 0 && number <= 10) {
            int num3 = number % 10;
            System.out.print(checkNumber(num3));
        } else if (number >= 11 && number < 100) {
            int num2 = (number / 10) % 10;
            int num3 = number % 10;
            System.out.print(checkNumber2(num2,num3));
            //10-99
        } else if (number >= 100 && number < 1000) {
            // 100 - 999
            int num1 = (number / 100) % 10;
            int num2 = (number / 10) % 10;
            int num3 = number % 10;

            System.out.print(checkNumber(num1) + " hundred " + checkNumber2(num2,num3));

        } else {
            System.out.println("out of ability");
        }


    }
}

