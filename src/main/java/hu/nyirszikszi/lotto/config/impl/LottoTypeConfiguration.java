package hu.nyirszikszi.lotto.config.impl;

import hu.nyirszikszi.lotto.config.LottoTypeProvider;
import hu.nyirszikszi.lotto.model.impl.LottoType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LottoTypeConfiguration {
    @Bean
    LottoTypeProvider lottoTypeProvider(){
        return new LottoTypeProviderImpl();
    }
}
