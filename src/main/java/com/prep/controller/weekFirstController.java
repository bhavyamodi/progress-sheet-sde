package com.prep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class weekFirstController extends BaseController{
    @GetMapping("/auth")
    public boolean getData() {
        return true;
    }
}
