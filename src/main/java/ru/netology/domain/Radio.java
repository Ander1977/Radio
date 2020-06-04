package ru.netology.domain;

public class Radio {
    private String name = "Asus";
    private int allStation = 11;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation = 5;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 0;
    private boolean on = true;

    public Radio() {
    }
    public Radio(int allStation) {
        this.allStation = allStation;
    }
    public void increaseCurrentStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }
    public void decreaseCurrentStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;

    }
    public void increaseCurrentVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }
    public void decreaseCurrentVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAllStation() {
        return allStation;
    }
    public void setAllStation(int allStation) {
        this.allStation = allStation;
    }
    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {

        this.maxStation = maxStation;
    }
    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {

        this.minStation = minStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }
    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
