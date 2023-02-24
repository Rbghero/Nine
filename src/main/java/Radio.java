public class Radio {

    private int currentRadioStationNumber;
    private int currentVolume = 50;
    private int numberOfStations = 10;
    private int maxStation = 9;



    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        maxStation = numberOfStations - 1;
    }



    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getVolume() {
        return currentVolume;
    }

    public int getNumberOfStations() {

        return numberOfStations;
    }


    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        ;
        if (newCurrentRadioStationNumber > maxStation) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void setVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void next() {
        if (currentRadioStationNumber < maxStation) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = maxStation;
        } else {
            currentRadioStationNumber--;
        }
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        } else {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume--;
        }
    }

}