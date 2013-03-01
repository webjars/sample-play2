import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;

import org.junit.*;
import play.mvc.Content;
import static play.test.Helpers.*;

public class ViewTest {

	@Test
	public void test() {
		running(fakeApplication(), new Runnable() {

			@Override
			public void run() {
				// Play requires a fake application to render this template
				Content html = views.html.index.render();
				assertThat(contentType(html)).isEqualTo("text/html");
				assertThat(contentAsString(html)).contains("hello, bootstrap");
			}
		});
	}

}
