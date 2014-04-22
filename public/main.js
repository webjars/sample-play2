require(['bootstrap'], function() {
    $("#showModalButton").bind('click', function(event) {
        $('#myModal').modal()
    })
})