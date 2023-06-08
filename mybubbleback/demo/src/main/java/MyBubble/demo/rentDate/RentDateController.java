package MyBubble.demo.rentDate;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class RentDateController {

    private final RentDateService rentDateService;

    public RentDateController(RentDateService rentDateService) {
        this.rentDateService = rentDateService;
    }

    @GetMapping
    public List<RentDate> getAllRentDates() {
        return rentDateService.getAllRentDates();
    }
    @GetMapping("/{id}")
    public RentDate getRentDateById(@PathVariable("id") Long id) {
        return rentDateService.getRentDateById(id);
    }


    @PostMapping("/add")
    public RentDate addRentDate(@RequestBody RentDate rentDate) {
        return rentDateService.addRentDate(rentDate);
    }


    @PutMapping("/update/{id}")
    public RentDate updateRentDate(@RequestBody RentDate rentDate, @PathVariable("id") Long id) {
        return rentDateService.updateRentDate(rentDate, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRentDate(@PathVariable("id") Long id) {
        rentDateService.deleteRentDate(id);
    }
}
