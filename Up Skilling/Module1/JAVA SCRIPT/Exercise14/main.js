$(document).ready(function(){

    // Click Event

    $("#registerBtn").click(function(){

        alert(
        "Registration Successful"
        );

    });

    // Fade Out

    $("#hideBtn").click(function(){

        $("#eventCard").fadeOut();

    });

    // Fade In

    $("#showBtn").click(function(){

        $("#eventCard").fadeIn();

    });

});