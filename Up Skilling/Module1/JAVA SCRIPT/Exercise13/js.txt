const form =
document.getElementById("registerForm");

form.addEventListener(
"submit",
function(event){

    event.preventDefault();

    console.log(
    "Form Submission Started"
    );

    const name =
    document.getElementById("name").value;

    console.log(
    "User Name:",
    name
    );

    // Breakpoint

    debugger;

    fetch(
    "https://jsonplaceholder.typicode.com/posts",

    {
        method:"POST",

        headers:{
            "Content-Type":
            "application/json"
        },

        body:JSON.stringify({
            username:name
        })
    })

    .then(response =>
        response.json()
    )

    .then(data => {

        console.log(
        "Response Received:"
        );

        console.log(data);

    })

    .catch(error => {

        console.log(
        "Error Found:"
        );

        console.log(error);

    });

});