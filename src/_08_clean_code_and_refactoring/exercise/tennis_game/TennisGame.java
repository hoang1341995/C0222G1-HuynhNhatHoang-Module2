package _08_clean_code_and_refactoring.exercise.tennis_game;

public class TennisGame {
    public static final int ADVANTAGE = 1;
    public static final int WIN = 2;
    public static final int CONDITION = 4;
    public static String result;
    public static int temp;

    public static String returnResult(int player1, int player2) {
        if (player1 == player2) {
            result = returnCompare(player1);
        } else if (player1 >= CONDITION || player2 >= CONDITION) {
            result = returnWinCompare(player1, player2);
        } else {
            result = winCompare(player1, player2);
        }
        return result;
    }

    public static String returnWinCompare(int player1, int player2) {
        if ((player1 - player2) >= WIN) result = "Win for player1";
        else if ((player1 - player2) == ADVANTAGE) result = "Advantage player1";
        else if ((player1 - player2) == -ADVANTAGE) result = "Advantage player2";
        else result = "Win for player2";
        return result;
    }

    public static String returnCompare(int temp) {
        switch (temp) {
            case 0:
                result = "Love-All";
                break;
            case 1:
                result = "Fifteen-All";
                break;
            case 2:
                result = "Thirty-All";
                break;
            case 3:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;
        }
        return result;
    }


    public static String winCompare(int player1, int player2) {
        for (int i = 1; i < 3; i++) {
            if (i == 1) temp = player1;
            else {
                result += "-";
                temp = player2;
            }
            switch (temp) {
                case 0:
                    result += "Love";
                    break;
                case 1:
                    result += "Fifteen";
                    break;
                case 2:
                    result += "Thirty";
                    break;
                case 3:
                    result += "Forty";
                    break;
            }
        }
        return result;
    }
}
