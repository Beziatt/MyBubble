package MyBubble.demo.rentPictures;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RentPicturesController {

    private final RentPicturesService rentPicturesService;

    public RentPicturesController(RentPicturesService rentPicturesService) {
        this.rentPicturesService = rentPicturesService;
    }

    @GetMapping
    public List<RentPictures> getAllRentPictures() {
        return rentPicturesService.getAllRentPictures();
    }
    @GetMapping("/{id}")
    public RentPictures getRentPicturesById(@PathVariable("id") Long id) {
        return rentPicturesService.getRentPicturesById(id);
    }


    @PostMapping("/add")
    public RentPictures addRentPictures(@RequestBody RentPictures rentPictures) {
        return rentPicturesService.addRentPictures(rentPictures);
    }


    @PutMapping("/update/{id}")
    public RentPictures updateRentPictures(@RequestBody RentPictures rentPictures, @PathVariable("id") Long id) {
        return rentPicturesService.updateRentPictures(rentPictures, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRentPictures(@PathVariable("id") Long id) {
        rentPicturesService.deleteRentPictures(id);
    }
}
