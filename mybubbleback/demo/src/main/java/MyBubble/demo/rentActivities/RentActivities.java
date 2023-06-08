package MyBubble.demo.rentActivities;

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
public class RentActivities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;
    private Number id;
    private Number pictoId;
    private Boolean isSharedActivity;

    @ManyToOne
    @JsonIgnoreProperties("rentActivities")
    private Bubble bubble;

}