package com.example.demo.utility;

public class GeoSequence {

    static int ratio;
    static int value;

    // accessed via instance reference라는 경고 메세지가 뜹니다.
    // ratio 변수에 static을 빼야 되나요?
    public GeoSequence(final int ratio){
        this.ratio = ratio;
    }

    public static int getRatio(){
        return ratio;
    }

    public static int allocSequence (final int cnt){
        for (int i = 0; i < cnt; i++){
            value = (int)(Math.pow(ratio, i));
            System.out.println(value);
        }
        return value;
    }
}
