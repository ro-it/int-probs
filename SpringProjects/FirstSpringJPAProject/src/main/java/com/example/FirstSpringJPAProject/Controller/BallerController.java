package com.example.FirstSpringJPAProject.Controller;

import com.example.FirstSpringJPAProject.Service.BallerService;
import com.example.FirstSpringJPAProject.model.Baller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("footballers")
public class BallerController {
    @Autowired
    BallerService ballerService;

    @GetMapping(value = "/baller/{ballerId}", produces = "application/json")
    public Baller getBallerById(@PathVariable int ballerId){
        return ballerService.getBallerById(ballerId);
    }

    @PostMapping("/baller")
    public int saveBaller(@RequestBody Baller baller){
        return ballerService.saveBaller(baller);
    }

    @PutMapping(value = "/baller", produces = "application/json")
    public Baller updateBaller(@RequestBody Baller baller){
        return ballerService.updateBaller(baller);
    }

    @DeleteMapping(value = "/baller/{ballerId}")
    public String deleteBaller(@PathVariable int ballerId){
        return ballerService.deleteBaller(ballerId);
    }
}
