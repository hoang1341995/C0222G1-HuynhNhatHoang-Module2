package _02_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Print the rectangle\n" +
                "2. Print the square triangle" +
                "(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                "3. Print isosceles triangle\n" +
                "4. Exit");
        while (true) {
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    char chr = '*';
                    int x = 3;
                    int y = 5;
                    for (int i = 0; i < x; i++) {
                        String str1 = "";
                        for (int j = 0; j < y; j++) {
                            str1 += chr;
                        }
                        System.out.println(str1);
                    }
                    break;
                case 2:
                    char str1 = '*';
                    char str2 = ' ';
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= 5; j++) {
                            int e = (6 - j); //5
                            int f = j; //1
                            if (i == 2 || i == 3) {
                                e = j; //1
                                f = (6 - j);//5
                            }
                            int c = 1;
                            int d = 1;
                            while (c <= f) {
                                if (i == 3 || i == 4) {
                                    str2 = '*';
                                    str1 = ' ';
                                }
                                System.out.print(str1);
                                c++;
                            }
                            while (d <= e) {
                                if (i == 3 || i == 4) {
                                    str2 = '*';
                                    str1 = ' ';
                                }
                                System.out.print(str2);
                                d++;
                            }
                            System.out.println("");
                        }
                        System.out.println("");
                    }

                    break;

                case 3:
                     str1 = ' ';
                     str2 = '*';
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= (10+1); j++) {
                            if (j > 5 - i && j < 5 + i) {
                                System.out.print(str2);
                            } else {
                                System.out.print(str1);
                            }
                        }
                        System.out.println("");
                    }

                    break;

                case 4:
                    System.exit(4);
                default:
                    System.out.println("Enter again");
            }
        }
    }
}
