package br.com.pi.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test") //usa o profile de teste - application-test.properties
public class PontoInteligenteApplicationTests {

	@Test
	public void contextLoads() {
	}

}
