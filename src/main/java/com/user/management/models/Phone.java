package com.user.management.models;

import lombok.Getter;
import lombok.Setter;

public class Phone {
    @Getter
    @Setter
    private String number;
    @Getter @Setter
    private String citycode;
    @Getter @Setter
    private String contrycode;
}
