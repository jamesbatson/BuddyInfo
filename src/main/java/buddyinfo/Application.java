package buddyinfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by adambatson on 2/7/2017.
 */
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(final BuddyInfoRepository repository) {
        return (args) -> {
            repository.save(new BuddyInfo("Adam Batson", "944-7138"));
            repository.save(new BuddyInfo("Max DeMelo", "555-1234"));
            repository.save(new BuddyInfo("Richard Carson", "613-0994"));

            System.out.println("Buddies found with findAll()");
            System.out.println("-------------------------------");
            for(BuddyInfo b : repository.findAll()) {
                System.out.println(b.toString());
            }
        };
    }

}
