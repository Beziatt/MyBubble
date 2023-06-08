package MyBubble.demo.Bubble;

import MyBubble.demo.rentActivities.RentActivities;
import MyBubble.demo.rentBonus.RentBonus;
import MyBubble.demo.rentDate.RentDate;
import MyBubble.demo.rentPictures.RentPictures;
import MyBubble.demo.user.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@RestController
public class Bubble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Number ownerId;
    private String type;
    private String otherType;
    private Number surface;
    private Number people;
    private Number room;
    private Number price;
    private String resume;
    private String postalCode;
    private String city;
    private String adress;
    private Number longitude;
    private Number latitude;
    private RentPictures[] pictures;
    private RentDate[]  dates;
    private RentActivities[] activities;
    private RentBonus[] bonus;
    private String iban;
    private String accountFirstname;
    private String accountLastname;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JsonIgnoreProperties("carList")
    private Set<RentActivities> rentActivitiesList = new HashSet<>();

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JsonIgnoreProperties("carList")
    private Set<RentBonus> rentBonusList = new HashSet<>();

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JsonIgnoreProperties("carList")
    private Set<RentDate> rentDateList = new HashSet<>();

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JsonIgnoreProperties("carList")
    private Set<RentPictures> rentPicturesList = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JsonIgnoreProperties("carList")
    private Set<User> userList = new HashSet<>();
}




