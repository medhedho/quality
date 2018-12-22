package ecommerce;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EcommerceApplication.class, webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTests {

    @Value("${local.server.port}")
    private int port;

    @Test
    public void runAndInvokeHedi(){
        String url = "http://localhost:"+ port + "/hedi";
        String body = new TestRestTemplate("hero","hero").getForObject(url, String.class);
        assertThat(body,is("Hedi"));
    }

}
