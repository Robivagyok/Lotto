package hu.nyirszikszi.lotto.config.impl;

import hu.nyirszikszi.lotto.config.LottoTypeConsumer;
import hu.nyirszikszi.lotto.config.LottoTypeProvider;
import hu.nyirszikszi.lotto.model.impl.LottoType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
class LottoTypeProviderImpl implements LottoTypeProvider, LottoTypeConsumer {
    private @Getter @Setter LottoType lottoType;


}
