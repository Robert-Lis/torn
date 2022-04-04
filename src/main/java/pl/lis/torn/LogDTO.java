package pl.lis.torn;

import lombok.Getter;

@Getter
public class LogDTO {
    private String log;
    private String title;
    private long timestamp;
    private String category;
    private Object data;
    private Object params;

}
