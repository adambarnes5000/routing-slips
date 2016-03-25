package info.adambarnes

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ImportResource
import org.springframework.integration.config.EnableIntegration

@SpringBootApplication
@EnableIntegration
@ImportResource("classpath*:integration-config.xml")
@ComponentScan("info.adambarnes")
class RoutingSlipsApplication {

	static void main(String[] args) {
		SpringApplication.run RoutingSlipsApplication, args
	}
}
