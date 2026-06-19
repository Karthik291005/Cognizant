// Event Data

const events = [

    {
        name: "Music Festival",
        seats: 20
    },

    {
        name: "Sports Day",
        seats: 15
    },

    {
        name: "Workshop",
        seats: 10
    }

];

// Access DOM Element

const container =
document.querySelector("#eventContainer");

// Display Events

events.forEach(function(event){

    let card =
    document.createElement("div");

    let title =
    document.createElement("h3");

    title.textContent =
    event.name;

    let seats =
    document.createElement("p");

    seats.textContent =
    "Available Seats: " +
    event.seats;

    let registerBtn =
    document.createElement("button");

    registerBtn.textContent =
    "Register";

    let cancelBtn =
    document.createElement("button");

    cancelBtn.textContent =
    "Cancel";

    // Register Event

    registerBtn.onclick =
    function(){

        if(event.seats > 0){

            event.seats--;

            seats.textContent =
            "Available Seats: " +
            event.seats;
        }
        else{

            alert(
            "No Seats Available"
            );
        }
    };

    // Cancel Registration

    cancelBtn.onclick =
    function(){

        event.seats++;

        seats.textContent =
        "Available Seats: " +
        event.seats;
    };

    card.appendChild(title);
    card.appendChild(seats);
    card.appendChild(registerBtn);
    card.appendChild(cancelBtn);

    container.appendChild(card);

});