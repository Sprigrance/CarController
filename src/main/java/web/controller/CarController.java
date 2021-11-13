package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        int carCount = 5;

        try {
            carCount = Integer.parseInt(count);
        } catch (NumberFormatException ignored) {}

        if (carCount >= 5) {
            carCount = 5;
        } else if (carCount < 0) {
            carCount = 0;
        }

        List<Car> cars = Car.makeCars(carCount);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
