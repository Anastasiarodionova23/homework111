package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void shouldSetStationWithinValidRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationAboveNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchFromNineToZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldSwitchToPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchFromZeroToNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldHandleMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldHandleMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldHandleVolumeBounds() {
        Radio radio = new Radio();
        for (int i = 0; i < 50; i++) {
            radio.increaseVolume();
        }
        assertEquals(50, radio.getCurrentVolume());
    }
}
