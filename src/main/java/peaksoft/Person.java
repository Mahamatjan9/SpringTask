package peaksoft;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Getter
@Setter
@ToString
@NoArgsConstructor
@Component
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.lastName}")
    private String lastName;
    @Value("${person.age}")
    private int  age;

    private Animal animal;

}
