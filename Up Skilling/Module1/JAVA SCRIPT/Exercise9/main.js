const loading =
document.querySelector("#loading");

const eventsDiv =
document.querySelector("#events");

// Async/Await Function

async function loadEvents() {

    loading.innerHTML =
    "Loading Events...";

    try {

        const response =
        await fetch(
        "https://jsonplaceholder.typicode.com/posts"
        );

        const data =
        await response.json();

        loading.innerHTML = "";

        eventsDiv.innerHTML = "";

        data.slice(0,5).forEach(
        event => {

            let p =
            document.createElement("p");

            p.textContent =
            event.title;

            eventsDiv.appendChild(p);

        });

    }

    catch(error) {

        loading.innerHTML =
        "Failed to Load Events";

        console.log(error);
    }
}