package indi.ly.yilimusic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <h2><span style="color: red;">依力音乐应用程序</span></h2>
 * <p>
 *     采用 <span style="color: red;">微信云托管</span> 的形式部署项目, 地址是 https://cloud.weixin.qq.com/cloudrun/service. <br /> <br />
 *
 *     关于生产环境上的项目所使用的 {@literal MYSQL} 数据库也来自于 <span style="color: red;">微信云托管</span> 的 {@literal MYSQL} 服务,
 *     {@literal Dockerfile} 文件中的 {@literal ENV} 环境变量就是 <span style="color: red;">微信云托管</span> 中的 {@literal MYSQL} 信息.
 * </p>
 * <br />
 *
 * @since 1.0
 * @author 云上的云
 * @formatter:off
 */
@SpringBootApplication(scanBasePackages = {"indi.ly.yilimusic"})
@SuppressWarnings("unused")
public class YiliMusicApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext yiliMusicApplication = SpringApplication.run(YiliMusicApplication.class, args);
	}
}
