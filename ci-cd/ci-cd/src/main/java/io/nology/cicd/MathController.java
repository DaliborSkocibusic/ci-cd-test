package io.nology.cicd;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {
	
	@GetMapping("/rectangle/a/{height}/{width}")
	public Integer rectangleArea(@PathVariable Integer height, @PathVariable Integer width) {
		return width * height;
	}
	
	@GetMapping("/circle/perimeter{radius}")
	public Double circleePerimeter(@PathVariable Double radius) {
		return 2 * Math.PI * radius;
	}
	
	// Can get these with get request now from postman.

}

web: java $JAVA_OPTS -jar target/mexico-spring-cicd-0.0.1-SNAPSHOT.jar --server.port=$PORT $JAR_OPTS
