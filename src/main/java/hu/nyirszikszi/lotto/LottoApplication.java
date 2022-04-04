package hu.nyirszikszi.lotto;

import hu.nyirszikszi.lotto.config.LottoTypeConsumer;
import hu.nyirszikszi.lotto.model.impl.LottoType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.MessageFormat;

@SpringBootApplication
public class LottoApplication {

	private static LottoType getLottoType(String arg) throws NumberFormatException{
		Integer value = Integer.valueOf(arg);
		return LottoType.fromInteger(value);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LottoApplication.class, args);
		LottoTypeConsumer lottoTypeConsumer = context.getBean(LottoTypeConsumer.class);
		if(args.length!=0) {
			lottoTypeConsumer.setLottoType(getLottoType(args[0]));
		}else lottoTypeConsumer.setLottoType(LottoType.Five);
	}

}
