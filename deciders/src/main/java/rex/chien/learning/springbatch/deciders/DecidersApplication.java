package rex.chien.learning.springbatch.deciders;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class DecidersApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecidersApplication.class, args);
	}
}
