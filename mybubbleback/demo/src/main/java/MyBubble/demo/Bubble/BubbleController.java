package MyBubble.demo.Bubble;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class BubbleController {

    private final BubbleService bubbleService;

    public BubbleController(BubbleService bubbleService) {
        this.bubbleService = bubbleService;
    }

    @GetMapping
    public List<Bubble> getAllBubbles() {
        return bubbleService.getAllBubbles();
    }
    @GetMapping("/{id}")
    public Bubble getBubbleById(@PathVariable("id") Long id) {
        return bubbleService.getBubbleById(id);
    }


    @PostMapping("/add")
    public Bubble add(@RequestBody Bubble bubble) {
        return bubbleService.addBubble(bubble);
    }


    @PutMapping("/update/{id}")
    public Bubble updateBubble(@RequestBody Bubble bubble, @PathVariable("id") Long id) {
        return bubbleService.updateBubble(bubble, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBubble(@PathVariable("id") Long id) {
        bubbleService.deleteBubble(id);
    }
}


