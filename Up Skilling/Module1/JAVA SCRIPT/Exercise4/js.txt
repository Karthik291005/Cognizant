// Event Array

let events = [

    {
        name: "Music Festival",
        category: "Music"
    },

    {
        name: "Sports Day",
        category: "Sports"
    },

    {
        name: "Baking Workshop",
        category: "Workshop"
    }

];

// Function to Add Event

function addEvent(name, category) {

    events.push({
        name: name,
        category: category
    });

    console.log(name + " Added Successfully");
}

// Function to Register User

function registerUser(userName, eventName) {

    console.log(
        userName +
        " Registered for " +
        eventName
    );
}

// Higher-Order Function

function filterEventsByCategory(eventList, callback) {

    return eventList.filter(callback);
}

// Closure Function

function registrationCounter() {

    let totalRegistrations = 0;

    return function() {

        totalRegistrations++;

        console.log(
            "Total Registrations: " +
            totalRegistrations
        );
    };
}

// Create Closure Object

const countRegistration =
registrationCounter();

// Add Event

addEvent(
    "Dance Competition",
    "Cultural"
);

// Register Users

registerUser(
    "Gopi",
    "Music Festival"
);

registerUser(
    "Ravi",
    "Sports Day"
);

// Track Registrations

countRegistration();

countRegistration();

countRegistration();

// Filter Events

let musicEvents =
filterEventsByCategory(

    events,

    function(event) {

        return event.category === "Music";
    }

);

console.log("Music Events:");

console.log(musicEvents);