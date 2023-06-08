package MyBubble.demo.rentPictures;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentPicturesRepository extends JpaRepository<RentPicturesRepository, Long> {
    List<RentPictures> getAllRentPictures();

    RentPictures getRentPicturesById(Long id);

    RentPictures addRentPicturesById(RentPictures rentPictures);

    RentPictures updateRentPictures(RentPictures rentPictures, Long id);

    void deleteRentPictures(Long id);
}
