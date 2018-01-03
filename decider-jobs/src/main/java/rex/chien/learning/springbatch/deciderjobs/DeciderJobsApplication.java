package rex.chien.learning.springbatch.deciderjobs;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class DeciderJobsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeciderJobsApplication.class, args);
	}
}
