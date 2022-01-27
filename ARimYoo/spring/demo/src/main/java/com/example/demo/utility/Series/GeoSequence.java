package com.example.demo.utility.Series;

import lombok.Data;

@Data
public class GeoSequence {

    private int ratio;
    private int value;

    public GeoSequence(int ratio) {

        this.ratio = ratio;
    }

    // void는 리턴값이 필요없음
    public void allocSequence(int cnt) {

        // 2의 0승부터 첫번째 항 이므로 cnt - 1
        value = (int) (Math.pow(ratio, cnt - 1));

    }
}
