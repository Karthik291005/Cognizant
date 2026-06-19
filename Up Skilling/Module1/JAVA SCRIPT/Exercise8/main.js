// Event Data

const events = [

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

const container =
document.querySelector("#eventContainer");

// Display Events

function displayEvents(eventList){

    container.innerHTML = "";

    eventList.forEach(function(event){

        let card =
        document.createElement("div");

        let title =
        document.createElement("h3");

        title.textContent =
        event.name;

        let category =
        document.createElement("p");

        category.textContent =
        "Category: " +
        event.category;

        let button =
        document.createElement("button");

        button.textContent =
        "Register";

        // onclick

        button.onclick = function(){

            alert(
            "Registered for " +
            event.name
            );
        };

        card.appendChild(title);
        card.appendChild(category);
        card.appendChild(button);

        container.appendChild(card);

    });

}

// Initial Display

displayEvents(events);

// onchange

document.querySelector(
"#categoryFilter"
).onchange = function(){

    let selectedCategory =
    this.value;

    if(selectedCategory === "All"){

        displayEvents(events);
    }

    else{

        let filteredEvents =
        events.filter(function(event){

            return event.category ===
            selectedCategory;
        });

        displayEvents(filteredEvents);
    }
};

// keydown

document.querySelector(
"#searchBox"
).onkeydown = function(){

    let searchText =
    this.value.toLowerCase();

    let searchedEvents =
    events.filter(function(event){

        return event.name
        .toLowerCase()
        .includes(searchText);
    });

    displayEvents(searchedEvents);
};