requirejs.config({
	paths: {
        'text': '/assets/text'
        //'plugins': '/assets/javascripts/durandal/plugins',  <---- This would also needed to figure out since this seems to be pointing to a directory
        //'transitions': '/assets/javascripts/durandal/transitions',  <---- this too
		//'knockout': '/assets/javascripts/knockout-3.0.0'  <---- Didn't try to get this from a webjar yet, in my somewhat working copy I used it like this.
    }
});

define(['webjars!system.js', 'webjars!app.js', 'webjars!viewLocator.js'],  function (system, app, viewLocator) {
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