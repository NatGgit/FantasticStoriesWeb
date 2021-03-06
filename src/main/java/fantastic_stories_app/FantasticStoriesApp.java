package fantastic_stories_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages =  {
        "fantastic_stories_app.controller",
        "fantastic_stories_app.model",
        "fantastic_stories_app.repository",
        "fantastic_stories_app.service"
})
public class FantasticStoriesApp {
    public static void main(String[] args) {
        SpringApplication.run(FantasticStoriesApp.class, args);
    }
}
