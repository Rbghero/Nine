import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio receiver = new Radio();
    Radio vol = new Radio();

    @Test
    public void shouldSetRadioStation() {

        receiver.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() {

        vol.setSoundVolume(5);

        int expected = 5;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {

        receiver.setCurrentRadioStationNumber(12);

        int expected = 0;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {

        receiver.setCurrentRadioStationNumber(-3);

        int expected = 0;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {

        receiver.setCurrentRadioStationNumber(4);
        receiver.next();

        int expected = 5;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation() {

        receiver.setCurrentRadioStationNumber(5);
        receiver.prev();

        int expected = 4;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNextRadioStationAboveMax() {

        receiver.setCurrentRadioStationNumber(9);
        receiver.next();

        int expected = 0;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetPrevRadioStationBelowMin() {

        receiver.setCurrentRadioStationNumber(0);
        receiver.prev();

        int expected = 9;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeAboveMax() {

        vol.setSoundVolume(12);

        int expected = 0;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeBelowMin() {

        vol.setSoundVolume(-3);

        int expected = 0;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolume() {

        vol.setSoundVolume(4);
        vol.increase();

        int expected = 5;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolume() {

        vol.setSoundVolume(5);
        vol.decrease();

        int expected = 4;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseSoundVolumeAboveMax() {

        vol.setSoundVolume(10);
        vol.increase();

        int expected = 0;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseSoundVolumeBelowMin() {

        vol.setSoundVolume(0);
        vol.decrease();

        int expected = 10;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}