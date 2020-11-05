package cs490.notification.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2
public class EmailApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailApiApplication.class, args);
	}

	@Bean
	public Docket emailApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()                 .apis(RequestHandlerSelectors.basePackage("cs490.notification.email"))
//				.paths(regex("/product.*"))
//				.paths(regex("/a"))
				.build();

	}

	@Bean
	public RecordMessageConverter converter() {
		return new StringJsonMessageConverter();
	}

}
