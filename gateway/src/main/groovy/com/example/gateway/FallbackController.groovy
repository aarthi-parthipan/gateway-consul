package com.example.gateway

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class FallbackController {
    @GetMapping("api/fallback")
    Mono<String> getService1FallbackMsg() {
        Mono.just("No response from service1")
    }
}
