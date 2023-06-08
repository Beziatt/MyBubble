package MyBubble.demo.Bubble;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BubbleRepository extends JpaRepository<Bubble, Long> {
    List<Bubble> getAllBubbles();

    Bubble getBubblesById(Long id);

    Bubble addBubble(Bubble bubble);

    Bubble updateBubble(Bubble bubble, Long id);

    void deleteBubble(Long id);

    List<Bubble> findAllBubbles();
}
