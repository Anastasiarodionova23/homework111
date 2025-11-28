package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationCount;

    public Radio() {
        this.stationCount = 10;
        this.currentStation = 0;
        this.currentVolume = 0;
    }

    public Radio(int stationCount) {
        if (stationCount <= 0) {
            this.stationCount = 10;
        } else {
            this.stationCount = stationCount;
        }
        this.currentStation = 0;
        this.currentVolume = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStationCount() {
        return stationCount;
    }

    public void setCurrentStation(int newStation) {
        if (newStation >= 0 && newStation < stationCount) {
            currentStation = newStation;
        }
    }

    public void next() {
        if (currentStation == stationCount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationCount - 1;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}

