package pl.lis.torn;

import lombok.Getter;

import java.util.Map;

@Getter
public class LogListDTO {
    private Map<String, LogDTO> log;
}