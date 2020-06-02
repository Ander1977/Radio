package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Radio {
    private String name = "Asus";
    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation = 5;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 0;
    private boolean on = true;


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


    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
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


}
