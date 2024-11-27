package org.example.practice.ekaCareInterview2;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {

    @Autowired
    private RouteService routeService;

    @GetMapping("/best-route")
    public Route getBestRoute(@RequestParam String from,
                              @RequestParam String to,
                              @RequestParam String criteria) {
        return routeService.getBestRoute(from, to, criteria);
    }
}
