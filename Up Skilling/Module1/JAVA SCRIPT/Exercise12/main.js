const form =
document.getElementById("registerForm");

const message =
document.getElementById("message");

form.addEventListener(
"submit",
function(event){

    event.preventDefault();

    message.textContent =
    "Submitting Registration...";

    const userData = {

        name:
        document.getElementById("name").value,

        email:
        document.getElementById("email").value
    };

    // Simulate Delay

    setTimeout(function(){

        fetch(
        "https://jsonplaceholder.typicode.com/posts",

        {
            method: "POST",

            headers: {
                "Content-Type":
                "application/json"
            },

            body:
            JSON.stringify(userData)
        })

        .then(response => {

            if(!response.ok){

                throw new Error(
                "Registration Failed"
                );
            }

            return response.json();
        })

        .then(data => {

            message.textContent =
            "Registration Successful!";

            console.log(data);
        })

        .catch(error => {

            message.textContent =
            "Registration Failed!";

            console.log(error);
        });

    }, 2000);

});