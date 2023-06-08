package MyBubble.demo.rentBonus;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentBonusService {

    private final RentBonusRepository rentBonusRepository;


    public List<RentBonus> getAllRentBonus() {
        return rentBonusRepository.getAllRentActivities();

    }

    public RentBonus getRentBonusById(Long id) {
        return rentBonusRepository.getRentActivitiesById(id);

    }

    public RentBonus addRentBonus(RentBonus rentBonus) {
        return rentBonusRepository.addRentActivitiesById(rentBonus);    }

    public RentBonus updateRentBonus(RentBonus rentBonus, Long id) {
        return rentBonusRepository.updateRentActivities(rentBonus, id);

    }

    public void deleteRentBonus(Long id) {rentBonusRepository.deleteRentBonus(id);
    }
}
