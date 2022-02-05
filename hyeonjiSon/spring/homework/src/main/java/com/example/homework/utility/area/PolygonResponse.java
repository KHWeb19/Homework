package com.example.homework.utility.area;

import lombok.Data;

@Data
public class PolygonResponse {
    private float area;

    public PolygonResponse(BaseCalc bc){ //public 데이터 타입이니까
        area = bc.getArea();
    }
}
