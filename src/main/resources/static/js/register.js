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
            var response = JSON.parse(data)
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
    if(password === confirm_password) {
        window.location.href="/login"
    } else {
        swal({
            title: "Error!",
            text: "Passwords Don't Match",
            icon: "error",
        });
    }
}

password.onchange = validatePassword;
confirm_password.onclick = validatePassword;
const input = document.getElementById('firstName,lastName,companyName,tel,email,username,password,cpwd');
input.setAttribute('required', '');

// function toggleButton1() {
//
//     var firstName = document.getElementById('firstName').value;
//     var lastName = document.getElementById('lastName').value;
//     var companyName = document.getElementById('companyName').value;
//     var tel = document.getElementById('tel').value;
//     var email = document.getElementById('email').value;
//     var username = document.getElementById('username').value;
//     var password = document.getElementById('password').value;
//     var cpwd = document.getElementById('cpwd').value;
//
//     if (firstName && lastName && companyName && tel && email && username && password && cpwd) {
//         document.getElementById('save-add-role').disabled = false;
//     } else
//
//     {
//         document.getElementById('save-add-role').disabled = true;
//     }
// }

