import javax.sound.sampled.*;
import java.io.File;

public class SoundFile {
	public String fileName;
	public File file;
	public double duration;
	
	public SoundFile(String initFileName) {
		fileName = initFileName;
		file = new File("/SoundSystem/src/Sound Files" + fileName);
	}
}
