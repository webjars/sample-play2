requirejs.config({
	paths: {
        'text': '/assets/text',
        'durandal': '../../webjars/durandal/2.0.1/js',
        'jquery': '../../webjars/jquery/2.0.3/jquery',
        'knockout': '../../webjars/knockout/2.2.1/knockout',
        'plugins': '../../webjars/durandal/2.0.1/js/plugins',
        'transitions': '../../webjars/durandal/2.0.1/js/transitions'
    }
});

define(['durandal/system', 'durandal/app', 'durandal/viewLocator'], function (system, app, viewLocator) {
    //>>excludeStart("build", true);
    system.debug(true);
    //>>excludeEnd("build");

    app.title = 'Webjars & Durandal Starter Kit';

    app.configurePlugins({
        router:true,
        dialog: true,
        widget: true
    });

    app.start().then(function() {
        //Replace 'viewmodels' in the moduleId with 'views' to locate the view.
        //Look for partial views in a 'views' folder in the root.
        viewLocator.useConvention();

        //Show the app by setting the root view model for our application with a transition.
        app.setRoot('viewmodels/shell', 'entrance');
    });
});