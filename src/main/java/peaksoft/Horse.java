package peaksoft;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Component
public class Horse implements Animal{
    @Value("${animal.breed}")
    private String breed;
    @Value("${animal.color}")
    private String color;
    @Value("${animal.age}")
    private int age;



    public void AnimalPrus() {
        System.out.println("+");

    }

    public void AnimalMinus() {
        System.out.println("-");

    }
}
