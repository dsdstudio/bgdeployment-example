package net.dsdstudio.bluegreentest;

import com.sun.xml.internal.ws.util.CompletedFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

/**
 * Created by bhkim on 2017. 7. 9..
 */
@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @GetMapping("/person")
    public Mono<Person> getPerson() {
        Person p = new Person();
        p.setName("Bohyung kim");
        return Mono.just(p);
    }
}
