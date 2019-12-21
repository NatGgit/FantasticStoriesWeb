package fantastic_stories_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages =  {
        "fantastic_stories_app.controller"
})
public class FantasticStoriesApp {
    public static void main(String[] args) {
        SpringApplication.run(FantasticStoriesApp.class, args);
    }
}
