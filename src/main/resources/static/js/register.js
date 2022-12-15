// function inputdata() {
//     var fname = document.getElementById("fname").value;
//     document.getElementById("demo").innerHTML = fname;
// }
// const input = document.getElementById('field');
// input.setAttribute('required', '');
// input.removeAttribute('required');

$('#new-user-form').on('submit', function (e) {
    e.preventDefault();

    var objectRegister = {
        "username": $('#username').val(),
        "password": $('#password').val(),
        "firstName": $('#firstName').val(),
        "lastName": $('#lastName').val() ,
        "email": $('#email').val() ,
        "tel": $('#tel').val() ,
        "companyName": $('#companyName').val(),
        "status": "active",
    }
    $.ajax({
        type: 'POST',
        async: false,
        dataType: 'text',
        data: JSON.stringify(objectRegister),
        contentType: 'application/json; charset=utf-8',
        url: '/apis/user/save',
        success: function (data, textStatus) {
            console.log("data -> ", data)
        },
        error: function (xhr, textStatus, errorThrown) {
            var response = JSON.parse(xhr.responseText);
            console.log("response -> ", response)
        }
    });
});

var password = document.getElementById("password")
    , confirm_password = document.getElementById("cpwd");

function validatePassword(){
    if(password.value != confirm_password.value) {
        confirm_password.setCustomValidity("Passwords Don't Match");
    } else {
        confirm_password.setCustomValidity('');
    }
}

password.onchange = validatePassword;
confirm_password.onkeyup = validatePassword;

