package pl.lis.torn;

import org.springframework.web.client.RestTemplate;
import org.springframework.data.domain.Range;

public class TornApiClient {

    private static final String TORN_API_URL = "https://api.torn.com";
    RestTemplate restTemplate = new RestTemplate();

    public LogListDTO getLogsFor(String apiKey, Range dateRage) {
        return callGetMethod("/user/?selections=log&from={from}&to={to}&key={apiKey}",
                LogListDTO.class,
                dateRage.getLowerBound(), dateRage.getUpperBound(), apiKey);
    }

    private <T> T callGetMethod(String url, Class<T> responseType, Object... parameters){
        return restTemplate.getForObject(TORN_API_URL + url, responseType, parameters);
    }
}