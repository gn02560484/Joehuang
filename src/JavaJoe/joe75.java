package JavaJoe;

import java.util.Timer;
import java.util.TimerTask;

public class joe75 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		MyTask mytask = new MyTask();
//		StopTimer stoptimer = new StopTimer(timer);
		System.out.println("here");
		timer.schedule(mytask, 1*1000, 1*1000);
//		timer.schedule(stoptimer, 10*1000);
		
		//timer.cancel();
	}

	
}

class MyTask extends TimerTask{
		@Override
		public void run() {
			System.out.println("OK");
		}
}

class StopTimer extends TimerTask{
	Timer timer;
	public StopTimer(Timer timer) {
		this.timer = timer;
	}
	@Override
	public void run() {
		timer.cancel();
	}
	
}