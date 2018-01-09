package rex.chien.learning.springbatch.statefulitemstream;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class StatefulItemStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatefulItemStreamApplication.class, args);
	}
}
