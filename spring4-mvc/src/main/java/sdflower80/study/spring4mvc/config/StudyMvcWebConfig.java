package sdflower80.study.spring4mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import sdflower80.study.spring4mvc.controller.StudyMvcControllers;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {
        StudyMvcControllers.class
})
public class StudyMvcWebConfig extends WebMvcConfigurerAdapter {
}
