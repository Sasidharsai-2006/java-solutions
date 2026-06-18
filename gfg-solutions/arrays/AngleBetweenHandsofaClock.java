public class AngleBetweenHandsofaClock {
  public double angleClock(int hour, int minutes) {
        hour=hour%12;
        double hourangel=(hour*30)+(minutes*0.5);
        double minangle=(minutes*6);
        double diff=Math.abs(hourangel-minangle);
        return Math.min(diff, 360 - diff);
    }
}
