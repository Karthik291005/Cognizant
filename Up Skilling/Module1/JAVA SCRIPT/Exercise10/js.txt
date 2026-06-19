// Event List

const events = [

    {
        name: "Music Festival",
        category: "Music",
        seats: 50
    },

    {
        name: "Sports Day",
        category: "Sports",
        seats: 30
    },

    {
        name: "Baking Workshop",
        category: "Workshop",
        seats: 20
    }

];

// Default Parameter Function

function registerUser(
    userName = "Guest"
){

    console.log(
        userName +
        " Registered Successfully"
    );
}

// Function Call

registerUser("Gopi");

registerUser();

// Destructuring

const {
    name,
    category,
    seats
} = events[0];

console.log("Event Details");

console.log("Name:", name);

console.log("Category:", category);

console.log("Seats:", seats);

// Spread Operator

const clonedEvents = [
    ...events
];

// Filter Music Events

const musicEvents =
clonedEvents.filter(
    event =>
    event.category === "Music"
);

console.log("Music Events");

console.log(musicEvents);