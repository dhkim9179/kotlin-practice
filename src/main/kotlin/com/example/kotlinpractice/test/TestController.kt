package com.example.kotlinpractice.test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping
    fun test():String {
        return "success"
    }

    @GetMapping("/test2")
    fun test2():String {
        return "success"
    }

    @GetMapping("/test3")
    fun test3():String {
        return "success"
    }

}