package MyBubble.demo.rentBonus;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentBonusRepository extends JpaRepository<RentBonusRepository, Long> {
    RentBonus updateRentActivities(RentBonus rentBonus, Long id);

    List<RentBonus> getAllRentActivities();

    RentBonus getRentActivitiesById(Long id);

    RentBonus addRentActivitiesById(RentBonus rentBonus);

    void deleteRentBonus(Long id);
}
