package com.example.saper;

import java.util.TimerTask;

public class SegmentDisplayTimer {
    SegmentDisplayTimer() {
        java.util.Timer myRepeatingTimer = new java.util.Timer();
        myRepeatingTimer.scheduleAtFixedRate(new TimerTask(){
            int i = 0;
            @Override
            public void run(){
                if(i < 10) {
                    Navbar.setHBoxGraphicBackground(Navbar.boxes[5], i);
                } else if (i < 100) {
                    Navbar.setHBoxGraphicBackground(Navbar.boxes[5], i % 10);
                    Navbar.setHBoxGraphicBackground(Navbar.boxes[4], (i / 10) % 10);
                } else if (i < 1000) {
                    Navbar.setHBoxGraphicBackground(Navbar.boxes[5], i % 10);
                    Navbar.setHBoxGraphicBackground(Navbar.boxes[4], (i / 10) % 10);
                    Navbar.setHBoxGraphicBackground(Navbar.boxes[3], (i / 100) % 10);
                } else {
                    myRepeatingTimer.cancel();
                }
                i++;
            }
        }, 0, 1000);
    }
}