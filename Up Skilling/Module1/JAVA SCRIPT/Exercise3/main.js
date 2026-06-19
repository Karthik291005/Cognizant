// Event List

const events = [

    {
        name: "Music Festival",
        seats: 20
    },

    {
        name: "Sports Day",
        seats: 0
    },

    {
        name: "Workshop",
        seats: 15
    }

];

// Display Events Using forEach()

events.forEach(function(event){

    if(event.seats > 0){

        console.log(
            event.name +
            " - Seats Available: " +
            event.seats
        );

    }

    else{

        console.log(
            event.name +
            " - Registration Closed"
        );

    }

});

// Registration Function

function register(event){

    try{

        if(event.seats <= 0){

            throw new Error(
                "No Seats Available"
            );

        }

        event.seats--;

        console.log(
            "Registration Successful for " +
            event.name
        );

        console.log(
            "Remaining Seats: " +
            event.seats
        );

    }

    catch(error){

        console.log(
            "Error: " +
            error.message
        );

    }

}

// Test Registration

register(events[0]);

register(events[1]);