package com.example.bank.entity;

import lombok.Data;

@Data
public class ViewRandomProduct {
    private Object[] randPro;

    public ViewRandomProduct(Object[] randPro) {
        this.randPro = randPro;
    }
}
