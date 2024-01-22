const loginFormElement = document.getElementById("form-login");
const messageText = document.querySelector(".message-text");
const passwordRegEx = new RegExp("^[a-zA-Z0-9@_]{8,}$");
const passwordRgx = new RegExp("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@_])[a-zA-Z0-9@_]{8, }");


loginFormElement.addEventListener("submit", (e) => {
    e.preventDefault();
    const usernameElement = e.target[0];
    const passwordElement = e.target[1];
    const username = usernameElement.value;
    const password = passwordElement.value;

    if(username === "" || username.length < 6) {
        messageText.innerText = "* Invalid username!! username must be aleast 6 characters.";
    } else if(password.length < 8) {
        messageText.innerText = "* Invalid password!! password must be aleast 8 characters.";
    } else if(!passwordRegEx.test(password)) {
        messageText.innerText = "* Invalid password!! password must contain only 0-9, a-z, A-Z, @ and _";
    } else {
        messageText.innerText = "Submited successfully."
    }
});

