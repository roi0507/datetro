package com.datetro.backendapi.controllers;

import com.datetro.backendapi.dao.MatchersRepository;
import com.datetro.models.Matcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MatchersController {

    @Autowired
    private MatchersRepository repository;

    @RequestMapping(path = "/matchers",method = RequestMethod.GET)
    public List<Matcher> getAll() {
        return (List<Matcher>) repository.findAll();
    }

    @RequestMapping(path = "/matchers",method = RequestMethod.POST)
    public void add(@RequestBody Matcher matcher) {
        repository.save(matcher);
    }

}
