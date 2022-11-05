package ru.romanow.simple.backend

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import
import org.springframework.test.context.ActiveProfiles
import ru.romanow.simple.backend.config.DatabaseTestConfiguration

@ActiveProfiles("test")
@SpringBootTest
@Import(DatabaseTestConfiguration::class)
internal class SimpleApplicationTest {

    @Test
    fun test() {
    }
}