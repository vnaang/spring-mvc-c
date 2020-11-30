package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;



@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String printCarList(@RequestParam(value = "count") int count, Model model) {
        CarServiceImpl carService = new CarServiceImpl();
        model.addAttribute("carList",carService.getCarList(count));
        return "cars";
    }
}
