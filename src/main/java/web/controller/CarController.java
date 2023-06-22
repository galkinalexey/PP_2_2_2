package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    CarServiceImp carServiceImp = new CarServiceImp();

    @GetMapping(value = "/car")
    public String printCars(ModelMap model, HttpServletRequest request) {

        List<String> messages = new ArrayList<>();

        int count = request.getParameter("count") != null ? Integer.parseInt(request.getParameter("count")) : 5;

        for (Car car : carServiceImp.getCars(count)) {
            if (!messages.contains(car.toString())) {
                messages.add(car.toString());
            }
        }

        model.addAttribute("messages", messages);

        return "car";
    }

}