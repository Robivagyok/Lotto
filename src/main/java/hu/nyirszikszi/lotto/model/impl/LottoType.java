package hu.nyirszikszi.lotto.model.impl;

import java.text.MessageFormat;

public enum LottoType {
    Five,
    Six;

    public static LottoType fromInteger(Integer value){
        switch (value){
            case 5 : return LottoType.Five;
            case 6 : return LottoType.Six;
            default: throw new IllegalArgumentException(MessageFormat.format("Nem megfelelő érték: {0}",value));
        }
    }
}
