package MyBubble.demo.rentActivities;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RentActivitiesController {

    private final RentActivitiesService rentActivitiesService;

    public RentActivitiesController(RentActivitiesService rentActivitiesService) {
        this.rentActivitiesService = rentActivitiesService;
    }

    @GetMapping
    public List<RentActivities> getAllRentActivities() {
        return rentActivitiesService.getAllRentActivities();
    }
    @GetMapping("/{id}")
    public RentActivities getRentActivitiesById(@PathVariable("id") Long id) {
        return rentActivitiesService.getRentActivitiesById(id);
    }


    @PostMapping("/add")
    public RentActivities addRentActivities(@RequestBody RentActivities rentActivities) {
        return rentActivitiesService.addRentActivities(rentActivities);
    }


    @PutMapping("/update/{id}")
    public RentActivities updateRentActivities(@RequestBody RentActivities rentActivities, @PathVariable("id") Long id) {
        return rentActivitiesService.updateRentActivities(rentActivities, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRentActivities(@PathVariable("id") Long id) {
        rentActivitiesService.deleteRentActivities(id);
    }
}
