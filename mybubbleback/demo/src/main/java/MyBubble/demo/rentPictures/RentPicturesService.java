package MyBubble.demo.rentPictures;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentPicturesService {

    private final RentPicturesRepository rentPicturesRepository;

    public List<RentPictures> getAllRentPictures() {
        return rentPicturesRepository.getAllRentPictures();    }

    public RentPictures getRentPicturesById(Long id) {
        return rentPicturesRepository.getRentPicturesById(id);
    }

    public RentPictures addRentPictures(RentPictures rentPictures) {
        return rentPicturesRepository.addRentPicturesById(rentPictures);
    }

    public RentPictures updateRentPictures(RentPictures rentPictures, Long id) {
        return rentPicturesRepository.updateRentPictures(rentPictures, id);
    }

    public void deleteRentPictures(Long id) {rentPicturesRepository.deleteRentPictures(id);
    }
}
