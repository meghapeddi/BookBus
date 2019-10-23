function registerValidate() {

    if((document.registerForm.fname.value).length < 3){
        alert("Enter valid First Name..!!");
        return false;
     
    }

    if((document.registerForm.lname.value).length < 3){
        alert("Enter valid Last Name..!!");
        return false;
    }

   
    if(((document.registerForm.password.value).length < 8) || ((document.registerForm.password.value).length > 15)){
        alert("Enter Password in the range of 8 to 15 characters..!!");
        return false;
    }

    
     if(((document.registerForm.contactno.value).length < 10) || ((document.registerForm.contactno.value).length > 10)){
        alert("Enter valid Contact Number..!!")
        return false;
    }

    if( document.registerForm.gender.value == "" ) {
        alert( "Please select your Gender..!!" );
        return false;
    }

}

function passwordValidate() {
    var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("confirmpassword").value;
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
}