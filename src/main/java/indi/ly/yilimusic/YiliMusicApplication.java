package indi.ly.yilimusic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <h2><span style="color: red;">依力音乐应用程序</span></h2>
 *
 * @since 1.0
 * @author 云上的云
 * @formatter:off
 */
@SpringBootApplication(scanBasePackages = {"indi.ly.yilimusic"})
@SuppressWarnings("unused")
public class YiliMusicApplication {
	public static void main(String[] args) {
		var yiliMusicApplication = SpringApplication.run(YiliMusicApplication.class, args);
	}
}
