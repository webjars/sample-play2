requirejs.config({
  shim: {
    'bootstrap': ['jquery']
  },
  paths: {
    'requirejs': '../lib/requirejs/require',
    'jquery': '../lib/jquery/jquery',
    'bootstrap': '../lib/bootstrap/js/bootstrap'
  }
});

require(['index']);