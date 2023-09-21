package JavaSamples;


public class InterfaceExample1 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     audioplayer gaana = new audioplayer();
	     videoplayer mxplayer = new videoplayer();

	     gaana.play();
	     gaana.pause();
	     gaana.stop();

	     mxplayer.play();
	     mxplayer.pause();
	     mxplayer.stop();
	}

}

interface MediaPlayer 
{
 void play();
 void pause();
 void stop();

}


class audioplayer implements MediaPlayer 
{
 public void play() {
     System.out.println("Playing audio file...");
 }

 public void pause() {
     System.out.println("Pausing audio file...");
 }

 public void stop() {
     System.out.println("Stopping audio file...");
 }

}

class videoplayer implements MediaPlayer {
 public void play() {
     // Implementation for playing a WAV file
     System.out.println("Playing video file...");
 }
 public void pause() {
     // Implementation for pausing a WAV file
     System.out.println("Pausing video file...");
 }
 public void stop() {
     // Implementation for stopping a WAV file
     System.out.println("Stopping video file...");
 }

}

