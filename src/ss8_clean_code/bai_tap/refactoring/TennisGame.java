package ss8_clean_code.bai_tap.refactoring;

public class TennisGame {

    public static final int zero = 0;
    public static final int one = 1;
    public static final int two = 2;
    public static final int three = 3;


    public static String getScore(String player1Name, String player2Name, int player1_score, int player2_score) {
        String score = "";
        int tempScore = zero;
        if (player1_score == player2_score) {
            switch (player1_score) {
                case zero:
                    score = "Love-All";
                    break;
                case one:
                    score = "Fifteen-All";
                    break;
                case two:
                    score = "Thirty-All";
                    break;
                case three:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (player1_score >= 4 || player2_score >= 4) {
            int minusResult = player1_score - player2_score;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1_score;
                else {
                    score += "-";
                    tempScore = player2_score;
                }
                switch (tempScore) {
                    case zero:
                        score += "Love";
                        break;
                    case one:
                        score += "Fifteen";
                        break;
                    case two:
                        score += "Thirty";
                        break;
                    case three:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
