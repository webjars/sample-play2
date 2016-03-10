package controllers;

import com.google.inject.Inject;
import org.webjars.play.RequireJS;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    @Inject WebJarAssets webJarAssets;
    @Inject RequireJS requireJS;

    public Result index() {
        return ok(index.render(webJarAssets, requireJS));
    }
  
}