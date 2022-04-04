package pl.lis.torn;

public class BlackJackMapper {

    public static BlackJack mapFrom(LogDTO log) {
        switch (log.getTitle()) {
            case "Casino blackjack win": {
                mapFromWin(log);
                break;
            }
            case "Casino blackjack lose": {
                mapfromLose(log);
                break;
            }
            case "Casino blackjack push": {
                mapFromPush(log);
                break;
            }
        }

    }
}