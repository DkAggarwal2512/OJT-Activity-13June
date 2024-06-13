package com.test;

import com.electronics.SmartPhone;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Apple", "iPhone 13");

        phone.powerOn();
        phone.connectToWiFi();
        phone.makeCall();
    }
}
