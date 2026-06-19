const form =
document.getElementById(
    "registrationForm"
);

form.addEventListener(
    "submit",
    function(event){

        // Prevent Page Reload

        event.preventDefault();

        // Clear Old Errors

        document.getElementById(
            "nameError"
        ).textContent = "";

        document.getElementById(
            "emailError"
        ).textContent = "";

        document.getElementById(
            "eventError"
        ).textContent = "";

        document.getElementById(
            "successMessage"
        ).textContent = "";

        // Capture Form Values

        let name =
        form.elements["name"].value;

        let email =
        form.elements["email"].value;

        let selectedEvent =
        form.elements["event"].value;

        let valid = true;

        // Validation

        if(name === ""){

            document.getElementById(
                "nameError"
            ).textContent =
            " Name is required";

            valid = false;
        }

        if(email === ""){

            document.getElementById(
                "emailError"
            ).textContent =
            " Email is required";

            valid = false;
        }

        if(selectedEvent === ""){

            document.getElementById(
                "eventError"
            ).textContent =
            " Select an event";

            valid = false;
        }

        // Success Message

        if(valid){

            document.getElementById(
                "successMessage"
            ).textContent =

            "Registration Successful for "
            + selectedEvent;

            console.log(
                "Name:", name
            );

            console.log(
                "Email:", email
            );

            console.log(
                "Event:", selectedEvent
            );
        }

    }
);