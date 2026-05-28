package school.hei.com.endpoint.controllerArith;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import school.hei.com.service.ArithService;

@RestController
@RequestMapping("/api")
public class ArithController {
    private final ArithService arithService;

    public ArithController(ArithService arithService) {
        this.arithService = arithService;
    }

    @GetMapping("/add")
    public double add(
            @RequestParam double a,
            @RequestParam double b
    ) {
        return arithService.add(a, b);
    }

    @GetMapping("/subtract")
    public double subtract(
            @RequestParam double a,
            @RequestParam double b
    ) {
        return arithService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public double multiply(
            @RequestParam double a,
            @RequestParam double b
    ) {
        return arithService.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(
            @RequestParam double a,
            @RequestParam double b
    ) {
        return arithService.divide(a, b);
    }
}
