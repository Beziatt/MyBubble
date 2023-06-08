package MyBubble.demo.rentDate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentDateService {

    private final RentDateRepository rentDateRepository;

    public List<RentDate> getAllRentDates() {
        return rentDateRepository.getAllRentDates();    }

    public RentDate getRentDateById(Long id) {
        return rentDateRepository.getRentDateById(id);
    }

    public RentDate addRentDate(RentDate rentDate) {
        return rentDateRepository.addRentDate(rentDate);
    }

    public RentDate updateRentDate(RentDate rentDate, Long id) {
        return rentDateRepository.updateRentDate(rentDate, id);
    }

    public void deleteRentDate(Long id) {rentDateRepository.deleteRentDate(id);
    }
}
