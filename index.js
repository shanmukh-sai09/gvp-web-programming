const loginFormElement = document.getElementById("form-login");
const messageText = document.querySelector(".message-text");
const messageContainer = document.querySelector(".message-container");
const messageCancleBtn = document.querySelector(".cancle-btn");
const passwordRegEx = new RegExp("^[a-zA-Z0-9@_]{8,}$");
const usernameRegEx = new RegExp("^[a-zA-Z][a-zA-Z0-9]{5,}$");
const passwordRgx = new RegExp("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@_])[a-zA-Z0-9@_]{8,}$");
const emailRegEx = new RegExp("^[a-z0-9]{3,}@gvpce[.]ac[.]in$");
const mobileRegEx = new RegExp("^[6-9][0-9]{9}$");

function validateLogin() {
    const username = document.loginForm.username.value;
    const password = document.loginForm.password.value;

    messageContainer.style.visibility = "visible";
    if(username === "" || username.length < 6) {
        messageText.innerText = "Invalid username!! username must be aleast 6 characters.";
    } else if(password.length < 8) {
        messageText.innerText = "Invalid password!! password must be aleast 8 characters.";
    } else if(!passwordRegEx.test(password)) {
        messageText.innerText = "Invalid password!! password must contain only 0-9, a-z, A-Z, @ and _";
    } else {
        messageText.innerText = "Submited successfully."
        return true;
    }

    window.scrollTo(0, 0);
    return false;
}

messageCancleBtn.addEventListener("click", () => {
    messageContainer.style.visibility = "hidden";
})

function validateRegistration() {
    messageContainer.style.visibility = "visible";

    const form = document.registrationForm;
    const username = form.username.value;
    const password = form.password.value;
    const cpassword = form.cpassword.value;
    const email = form.email.value;
    const mobile = form.mobile.value;
    const dob = form.dob.value;

    if(!usernameRegEx.test(username)) {
        messageText.innerText = "Invalid username!! username must be aleast 6 characters and should begin with digits.";
    } else if(!passwordRgx.test(password)) {
        messageText.innerText = "Invalid password!! password must contain atleast one 0-9, atleast one a-z, atleast one A-Z, atleast one @ and _ and atleast of size 8";
    } else if(cpassword !== password) {
        messageText.innerText = "Confirm password and password must be same";
    } else if(!emailRegEx.test(email)) {
        messageText.innerHTML = "Invalid Email !!";
    } else if(!mobileRegEx.test(mobile)) {
        messageText.innerText = "Invalid mobile number !!";
    } else {
        messageContainer.innerText = "Registered Successfully";
        return true;
    }

    window.scrollTo(0, 0);
    return false;
}