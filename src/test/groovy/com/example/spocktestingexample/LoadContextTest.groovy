import com.example.spocktestingexample.SpockTestingExampleApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

@SpringBootTest(classes = [SpockTestingExampleApplication])
class LoadContextTest extends Specification {

    @Autowired
    private ApplicationContext applicationContext

    def "Spring Boot application "() {
        expect:
        applicationContext != null
    }
}