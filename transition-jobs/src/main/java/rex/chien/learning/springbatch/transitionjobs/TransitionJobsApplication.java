package rex.chien.learning.springbatch.transitionjobs;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class TransitionJobsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransitionJobsApplication.class, args);
	}
}
