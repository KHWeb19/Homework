package com.example.bank.entity.bank9;

import lombok.Data;

@Data
public class ViewRandomProduct {
    private Object[] randPro;

    public ViewRandomProduct(Object[] randPro) {
        this.randPro = randPro;
    }
}
