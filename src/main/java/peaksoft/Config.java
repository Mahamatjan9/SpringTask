package peaksoft;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("peaksoft")
@PropertySource("application.properties")
public class Config{

}
