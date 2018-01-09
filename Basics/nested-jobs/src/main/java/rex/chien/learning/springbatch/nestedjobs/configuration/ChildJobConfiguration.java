package rex.chien.learning.springbatch.nestedjobs.configuration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Title: ChildJobConfiguration</p>
 * <p>Description: ChildJobConfiguration</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: HGData</p>
 * <p>Created Date: 2018/1/2 下午 06:52</p>
 *
 * @author rex.chien
 * @version 1.0
 */
@Configuration
public class ChildJobConfiguration {
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Bean
    public Step step1a() {
        return stepBuilderFactory.get("step1a")
                .tasklet((contribution, chunkContext) -> {
                    System.out.println("\t>> This is step 1a");

                    return RepeatStatus.FINISHED;
                })
                .build();
    }

    @Bean
    public Job childJob() {
        return jobBuilderFactory.get("childJob")
                .start(step1a())
                .build();
    }
}
