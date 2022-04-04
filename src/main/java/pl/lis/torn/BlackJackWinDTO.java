package pl.lis.torn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlackJackWinDTO {

    private String playerCards;
    private String dealerCards;
    private long winnings;
    private String winState; //here is info about naturals
}
