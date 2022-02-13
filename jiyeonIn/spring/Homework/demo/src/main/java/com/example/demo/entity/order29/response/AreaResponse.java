package com.example.demo.entity.order29.response;

import com.example.demo.entity.order29.Area.Area;
import lombok.Getter;

@Getter
public class AreaResponse {
    private double totalarea;

    public AreaResponse(Area area) {
        totalarea = area.getArea();
    }
}
