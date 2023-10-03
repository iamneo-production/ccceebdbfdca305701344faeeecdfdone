package com.examly.springapp.controller;

import com.examly.springapp.model.Laptop;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/laptops")
public class LaptopController {

    private final List<Laptop> laptops = new ArrayList<>();

    @PostMapping("/")
    public boolean addLaptop(@RequestBody Laptop laptop) {
        return laptops.add(laptop);
    }

    @GetMapping("/{laptopid}")
    public Laptop getLaptopById(@PathVariable int laptopid) {
        for (Laptop laptop : laptops) {
            if (laptop.getLaptopid() == laptopid) {
                return laptop;
            }
        }
        return null;
    }

    @GetMapping("/")
    public List<Laptop> getAllLaptops() {
        return laptops;
    }
}