package com.example.demo.entity.order30.probank;

import com.example.demo.entity.order30.probank.RegularPolygon;
import lombok.Data;

import java.awt.*;

@Data
public class PolygonResponse {
    private float area;

    public PolygonResponse(RegularPolygon rp){
        area = rp.getArea();
    }
}
