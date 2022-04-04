package hu.nyirszikszi.lotto.model;

import hu.nyirszikszi.lotto.exception.InvalidLottoNumberCountException;
import hu.nyirszikszi.lotto.exception.InvalidLottoTipException;

import java.util.Optional;
import java.util.Set;

public interface Lotto {

    Set<Integer> generate();
    Integer validate(Set<Integer> setOfTips ,Set<Integer> resultSet) throws InvalidLottoNumberCountException, InvalidLottoTipException;
}
