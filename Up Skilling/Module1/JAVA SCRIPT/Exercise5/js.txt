// Event Class

class Event {

    constructor(name, date, seats) {

        this.name = name;
        this.date = date;
        this.seats = seats;
    }
}

// Add Method to Prototype

Event.prototype.checkAvailability = function() {

    if (this.seats > 0) {
        return "Seats Available";
    }
    else {
        return "Event Full";
    }
};

// Create Event Objects

let event1 = new Event(
    "Music Festival",
    "10-Jun-2026",
    50
);

let event2 = new Event(
    "Sports Day",
    "15-Jun-2026",
    0
);

// Check Availability

console.log(
    event1.name + " : " +
    event1.checkAvailability()
);

console.log(
    event2.name + " : " +
    event2.checkAvailability()
);

// Display Keys and Values

console.log("Event 1 Details");

Object.entries(event1).forEach(
    ([key, value]) => {

        console.log(
            key + " : " + value
        );
    }
);