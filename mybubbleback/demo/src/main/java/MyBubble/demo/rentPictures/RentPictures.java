package MyBubble.demo.rentPictures;

import MyBubble.demo.Bubble.Bubble;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RentPictures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String src;

    @ManyToOne
    @JsonIgnoreProperties("rentPictures")
    private Bubble bubble;

}