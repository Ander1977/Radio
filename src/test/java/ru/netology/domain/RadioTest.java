package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void increaseCurrentStation() {
        Radio radio = new Radio();
        radio.setName("Asus");
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setOn(true);
        radio.setCurrentStation(2);
        radio.increaseCurrentStation();
        assertEquals(3, radio.getCurrentStation());
    }
    @Test
    void decreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setName("Asus");
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setOn(true);
        radio.setCurrentStation(8);
        radio.decreaseCurrentStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void increaseMaxStation() {
        Radio radio = new Radio();
        radio.setName("Asus");
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setOn(true);
        radio.setCurrentStation(9);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void decreaseMinStation() {
        Radio radio = new Radio();
        radio.setName("Asus");
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setOn(true);
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void MinStation() {
        Radio radio = new Radio();
        radio.setName("Asus");
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setOn(true);
        radio.setCurrentStation(-1);
        assertEquals(radio.getCurrentStation(),0);
    }
    @Test
    void MaxStation() {
        Radio radio = new Radio();
        radio.setName("Asus");
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setOn(true);
        radio.setCurrentStation(10);
        assertEquals(radio.getCurrentStation(),0);
    }
    @Test
    void increaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setName("Asus");
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setOn(true);
        radio.setCurrentVolume(8);
        radio.increaseCurrentVolume();
        assertEquals(9, radio.getCurrentVolume());
    }
    @Test
    void decreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setName("Asus");
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setOn(true);
        radio.setCurrentVolume(7);
        radio.decreaseCurrentVolume();
        assertEquals(6, radio.getCurrentVolume());
    }



    @Test
    void MinVolume() {
        Radio radio = new Radio();
        radio.setName("Asus");
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setOn(true);
        radio.setCurrentVolume(-1);
        assertEquals(radio.getCurrentVolume(),0);
    }
    @Test
    void MaxVolume() {
        Radio radio = new Radio();
        radio.setName("Asus");
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setOn(true);
        radio.setCurrentVolume(11);
        assertEquals(radio.getCurrentVolume(),0);
    }
    @Test
    void increaseMaxVolume() {
        Radio radio = new Radio();
        radio.setName("Asus");
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setOn(true);
        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    void decreaseMinVolume() {
        Radio radio = new Radio();
        radio.setName("Asus");
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setOn(true);
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }


}