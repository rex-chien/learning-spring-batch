package rex.chien.learning.springbatch.joblisteners;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class JobListenersApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobListenersApplication.class, args);
	}
}
