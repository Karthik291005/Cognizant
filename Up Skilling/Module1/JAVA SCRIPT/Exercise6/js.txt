// Event Array

let events = [

    {
        name: "Music Festival",
        category: "Music"
    },

    {
        name: "Sports Day",
        category: "Sports"
    }

];

// Add New Events using push()

events.push(
    {
        name: "Baking",
        category: "Workshop"
    }
);

events.push(
    {
        name: "Music Night",
        category: "Music"
    }
);

console.log("All Events");
console.log(events);

// Filter Only Music Events

let musicEvents = events.filter(
    function(event) {

        return event.category === "Music";
    }
);

console.log("Music Events");
console.log(musicEvents);

// Format Display Cards using map()

let displayCards = events.map(
    function(event) {

        return "Workshop on " + event.name;
    }
);

console.log("Display Cards");
console.log(displayCards);