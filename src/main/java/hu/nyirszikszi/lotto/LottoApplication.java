package hu.nyirszikszi.lotto;

import hu.nyirszikszi.lotto.config.LottoTypeConsumer;
import hu.nyirszikszi.lotto.model.impl.LottoType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LottoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LottoApplication.class, args);
		LottoTypeConsumer lottoTypeConsumer = context.getBean(LottoTypeConsumer.class);
		lottoTypeConsumer.setLottoType(LottoType.Five);

	}

}
