package MyBubble.demo.rentDate;

import MyBubble.demo.Bubble.Bubble;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RentDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JsonIgnoreProperties("rentDate")
    private Bubble bubble;

}