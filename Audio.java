import java.util.Date;
import static java.lang.System.out;
import javax.media.Player;
import javax.media.Manager;
import java.io.File;
class Audio
{
 static public void main(String...ar)throws Exception
  {
   Player play=Manager.createRealizedPlayer(new File("G:/Technosofe assignment/a/a.wav").toURI().toURL());
  play.start();
  Thread.sleep(2000);
  play.stop();
  Date date=new Date();
   out.println(date);
   System.exit(0);
  }
}