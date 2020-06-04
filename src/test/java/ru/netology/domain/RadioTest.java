package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldUseMaxStationConstructor() {
        assertEquals(10, radio.getMaxStation());
    }

    @Test
    void shouldUseNoArgsConstructor() {
        assertEquals("Asus", radio.getName());
        assertEquals(10, radio.getMaxStation());
        assertEquals(0, radio.getMinStation());
        assertEquals(5, radio.getCurrentStation());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(0, radio.getCurrentVolume());
        assertTrue(radio.isOn());
    }


    @Test
    void increaseCurrentStation() {
        radio.increaseCurrentStation();

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStation() {
        radio.decreaseCurrentStation();

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void increaseMaxStation() {
        radio.setCurrentStation(10);

        radio.increaseCurrentStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void decreaseMinStation() {
        radio.setCurrentStation(0);

        radio.decreaseCurrentStation();

        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void minStation() {
        radio.setCurrentStation(-1);


        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void maxStation() {
        radio.setCurrentStation(11);

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void increaseCurrentVolume() {
        radio.setCurrentVolume(80);

        radio.increaseCurrentVolume();

        assertEquals(81, radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume() {
        radio.setCurrentVolume(70);

        radio.decreaseCurrentVolume();

        assertEquals(69, radio.getCurrentVolume());
    }

    @Test
    void minVolume() {
        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void maxVolume() {
        radio.setCurrentVolume(110);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void increaseMaxVolume() {
        radio.setCurrentVolume(100);

        radio.increaseCurrentVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void decreaseMinVolume() {
        radio.setCurrentVolume(0);

        radio.decreaseCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

}