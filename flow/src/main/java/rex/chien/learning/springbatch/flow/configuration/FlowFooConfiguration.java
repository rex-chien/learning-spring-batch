package rex.chien.learning.springbatch.flow.configuration;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Rex Chien
 */
@Configuration
public class FlowFooConfiguration {
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .tasklet((contribution, chunkContext) -> {
                    System.out.println(">> This is step 1 in Flow foo");
                    return RepeatStatus.FINISHED;
                }).build();
    }

    @Bean
    public Step step2() {
        return stepBuilderFactory.get("step2")
                .tasklet((contribution, chunkContext) -> {
                    System.out.println(">> This is step 2 in Flow foo");
                    return RepeatStatus.FINISHED;
                }).build();
    }

    @Bean
    public Flow foo() {
        FlowBuilder<Flow> flowBuilder = new FlowBuilder<>("foo");

        flowBuilder.start(step1())
                .next(step2())
                .end();

        return flowBuilder.build();
    }
}
