package MyBubble.demo.Bubble;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BubbleService {

    private final BubbleRepository bubbleRepository;


    public Bubble getBubbleById(Long id) {
        return bubbleRepository.getBubblesById(id);
    }


    public Bubble updateBubble(Bubble bubble, Long id) {
        return bubbleRepository.updateBubble(bubble, id);
    }

    public void deleteBubble(Long id) {
        bubbleRepository.deleteBubble(id);
    }

    public List<Bubble> getAllBubbles() {return bubbleRepository.findAllBubbles();
    }

    public Bubble addBubble(Bubble bubble) {return bubbleRepository.save(bubble);
    }
}