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

    @GetMapping("/test4")
    fun test4():String {
        return "success"
    }

    @GetMapping("/test5")
    fun test5():String {
        return "success"
    }

    @GetMapping("/test6")
    fun test6():String {
        return "success"
    }

    @GetMapping("/test7")
    fun test7():String {
        return "success"
    }

}