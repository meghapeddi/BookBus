function registerValidate() {


    if(((document.registerForm.password.value).length < 8) || ((document.registerForm.password.value).length > 15)){
        alert("Enter Password in the range of 8 to 15 characters..!!");
        return false;
    }
}
