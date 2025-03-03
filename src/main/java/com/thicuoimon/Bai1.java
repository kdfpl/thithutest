package com.thicuoimon;

public class Bai1 {
    public String soChanle(Integer number) {
        if (number == null) {
            throw new NullPointerException("Khong duoc Null");
        } else if (number % 2 == 0) {
            return "So chan";
        } else {
            return "So le";
        }
    }
}
