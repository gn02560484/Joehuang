package JClock;
public interface ClockListener {
	void timeChanged(int h, int m, int s, boolean isAM);
	void runningChanged(boolean running);
}
