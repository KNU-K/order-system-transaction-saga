package com.example.sagatransaction

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/test")
class TestController {
    @GetMapping
    fun test():String{
        return "it is endpoint for test"
    }
}