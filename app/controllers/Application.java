package controllers;

import com.google.inject.Inject;
import play.mvc.*;

public class Application extends Controller {

    @Inject views.html.index indexTemplate;

    public Result index() {
        return ok(indexTemplate.render());
    }

}
