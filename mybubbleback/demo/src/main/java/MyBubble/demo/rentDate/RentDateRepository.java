package MyBubble.demo.rentDate;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentDateRepository extends JpaRepository<RentDateRepository, Long> {
    List<RentDate> getAllRentDates();

    RentDate getRentDateById(Long id);

    RentDate addRentDate(RentDate rentDate);

    RentDate updateRentDate(RentDate rentDate, Long id);

    void deleteRentDate(Long id);
}
