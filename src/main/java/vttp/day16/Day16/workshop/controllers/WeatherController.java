package vttp.day16.Day16.workshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vttp.day16.Day16.workshop.models.Weather;
import vttp.day16.Day16.workshop.services.WeatherService;

@Controller
@RequestMapping(path={"/weather"})
public class WeatherController {

      @Autowired
      private WeatherService weatherSvc;

      @GetMapping
      public String getWeather(
            Model model,
            @RequestParam String city) {
                  List<Weather> w = weatherSvc.getWeather(city);
                  model.addAttribute("city", city.toUpperCase());
                  model.addAttribute("w", w);
                  return "weather";
      }
}
