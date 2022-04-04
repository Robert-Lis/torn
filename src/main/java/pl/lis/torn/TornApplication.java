package pl.lis.torn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.domain.Range;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TornApplication {

	public static void main(String[] args) {
		SpringApplication.run(TornApplication.class, args);
		TornApiClient torn = new TornApiClient();
		LogListDTO logsFor = torn.getLogsFor("0pEna0TRs2ZYTPCv", Range.closed(Long.valueOf(1648790824), Long.valueOf(1648798024)));
		Set<String> logsType = new HashSet<>();
		logsFor.getLog().forEach((k,v) -> {
			String title = v.getTitle();
			if (title.contains("blackjack")){
				logsType.add(title);
			}
		});



		System.out.println(logsFor.toString());	}

}
