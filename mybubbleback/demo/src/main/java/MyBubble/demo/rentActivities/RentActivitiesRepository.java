package MyBubble.demo.rentActivities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentActivitiesRepository extends JpaRepository<RentActivitiesRepository, Long> {
    List<RentActivities> getAllRentActivities();

    RentActivities getRentActivitiesById(Long id);

    RentActivities updateRentActivities(RentActivities rentActivities, Long id);

    void deleteRentActivities(Long id);

    RentActivities addRentActivitiesById(RentActivities rentActivities);
}
