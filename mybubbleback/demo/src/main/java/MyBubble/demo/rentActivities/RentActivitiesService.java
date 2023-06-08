package MyBubble.demo.rentActivities;

import MyBubble.demo.Bubble.Bubble;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentActivitiesService {

    private final RentActivitiesRepository rentActivitiesRepository;

    public List<RentActivities> getAllRentActivities() {
        return rentActivitiesRepository.getAllRentActivities();
    }

    public RentActivities getRentActivitiesById(Long id) {
        return rentActivitiesRepository.getRentActivitiesById(id);
    }

    public RentActivities addRentActivities(RentActivities rentActivities) {
        return rentActivitiesRepository.addRentActivitiesById(rentActivities);
    }

    public RentActivities updateRentActivities(RentActivities rentActivities, Long id) {
        return rentActivitiesRepository.updateRentActivities(rentActivities, id);
    }

    public void deleteRentActivities(Long id) {
        rentActivitiesRepository.deleteRentActivities(id);
    }
}

