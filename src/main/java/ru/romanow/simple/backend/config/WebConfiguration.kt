package ru.romanow.simple.backend.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport

@EnableWebMvc
@Configuration
class WebConfiguration : WebMvcConfigurationSupport() {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("*")
    }
}