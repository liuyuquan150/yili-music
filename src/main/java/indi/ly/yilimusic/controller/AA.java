package indi.ly.yilimusic.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h2><span style="color: red;"></span></h2>
 *
 * <h3><span style="color: red;"></span></h3>
 * <p>
 * </p>
 * <br />
 *
 * @author 云上的云
 * @since 1.0
 */
@CrossOrigin
@RestController
public class AA {
	@GetMapping(value = "hello")
	public String v() {
		return "test";
	}
}
