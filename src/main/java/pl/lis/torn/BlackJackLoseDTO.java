package pl.lis.torn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlackJackLoseDTO {

    private String playerCards;
    private String dealerCards;
    private long losses;
    private String loseState; // lost to the dealer || went bust
}
