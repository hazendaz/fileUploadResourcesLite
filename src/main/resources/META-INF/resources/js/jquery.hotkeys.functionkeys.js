$(document).ready(function() {
    $(document).on('keydown', null, 'f10', function(event) {
        // Throw a notification to the user what keys they successfully typed
        alert('You pressed F10');
        event.stopPropagation();
        event.preventDefault();
        return false;
    });

    $(document).on('keydown', null, 'f1', function(event) {
        // Throw a notification to the user what keys they successfully typed
        alert('You pressed F1');
        event.stopPropagation();
        event.preventDefault();
        return false;
    });

    $(document).on('keydown', null, 'f2', function(event) {
        // Throw a notification to the user what keys they successfully typed
        alert('You pressed F2');
        event.stopPropagation();
        event.preventDefault();
        return false;
    });

});