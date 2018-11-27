package com.ocr.anthony;

public class If {
    int x = 16;
    int y = 22;

    public void If(int x, int y) {
        if ((x == 5 || x >= 12) && ((y > 7 && y < 20) || x % 4 == 0)) {
            System.out.println(x+y);
        }
    }
}
