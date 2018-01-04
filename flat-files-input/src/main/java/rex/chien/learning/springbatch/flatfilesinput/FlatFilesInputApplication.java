package rex.chien.learning.springbatch.flatfilesinput;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class FlatFilesInputApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlatFilesInputApplication.class, args);
	}
}
