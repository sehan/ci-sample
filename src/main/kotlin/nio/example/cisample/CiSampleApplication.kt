package nio.example.cisample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CiSampleApplication

fun main(args: Array<String>) {
	runApplication<CiSampleApplication>(*args)
}
