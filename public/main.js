require(['webjars!bootstrap.min'], function() {
    $("#showModalButton").bind('click', function(event) {
        $('#myModal').modal()
    })
})