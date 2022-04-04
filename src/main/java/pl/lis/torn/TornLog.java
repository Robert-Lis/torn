package pl.lis.torn;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class TornLog {

    private String log;
    private String title;
    private long unixTimestamp;
    private LocalDateTime timestamp;

}