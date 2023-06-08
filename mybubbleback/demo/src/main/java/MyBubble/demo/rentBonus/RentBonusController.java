package MyBubble.demo.rentBonus;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RentBonusController {

    private final RentBonusService rentBonusService;

    public RentBonusController(RentBonusService rentBonusService) {
        this.rentBonusService = rentBonusService;
    }

    @GetMapping
    public List<RentBonus> getAllRentBonus() {
        return rentBonusService.getAllRentBonus();
    }
    @GetMapping("/{id}")
    public RentBonus getRentBonusById(@PathVariable("id") Long id) {
        return rentBonusService.getRentBonusById(id);
    }


    @PostMapping("/add")
    public RentBonus addRentBonus(@RequestBody RentBonus rentBonus) {
        return rentBonusService.addRentBonus(rentBonus);
    }


    @PutMapping("/update/{id}")
    public RentBonus updateRentBonus(@RequestBody RentBonus bubble, @PathVariable("id") Long id) {
        return rentBonusService.updateRentBonus(bubble, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRentBonus(@PathVariable("id") Long id) {
        rentBonusService.deleteRentBonus(id);
    }
}
