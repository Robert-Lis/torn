package pl.lis.torn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlackJackPushDTO {

    private String playerCards;
    private String dealerCards;
    private long money;
}
