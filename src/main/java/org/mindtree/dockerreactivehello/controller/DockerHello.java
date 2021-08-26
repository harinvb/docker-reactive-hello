package org.mindtree.dockerreactivehello.controller;

import java.time.Duration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("hiDocker")
public class DockerHello {
    
    @GetMapping
    public Flux<String> respondToHello(){
        return Flux
        .just("Streaming Text.... </br></br>","Hello"," this"," is"," from"," docker"," with"," Spring"," Reactive Web ....","</br></br> Streaming Text Completed")
        .delayElements(Duration.ofSeconds(1));
    }

}
