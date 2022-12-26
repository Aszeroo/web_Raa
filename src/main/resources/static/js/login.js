
    const container = document.querySelector(".container"),
    pwShowHide = document.querySelectorAll(".showHidePw"),
    pwFields = document.querySelectorAll(".password");

    //   js code to show/hide password and change icon
    pwShowHide.forEach(eyeIcon =>{
    eyeIcon.addEventListener("click", ()=>{
        pwFields.forEach(pwField =>{
            if(pwField.type ==="password"){
                pwField.type = "text";

                pwShowHide.forEach(icon =>{
                    icon.classList.replace("uil-eye-slash", "uil-eye");
                })
            }else{
                pwField.type = "password";

                pwShowHide.forEach(icon =>{
                    icon.classList.replace("uil-eye", "uil-eye-slash");
                })
            }
        })
    })
})

    $('#login-user-form').on('submit', function (e) {
        e.preventDefault();
        var objectLogin = {
            "email": $('#email').val(),
            "password": $('#password').val()
        }
        $.ajax({
            type: 'POST',
            async: false,
            dataType: 'text',
            data: JSON.stringify(objectLogin),
            contentType: 'application/json; charset=utf-8',
            url: '/apis/user/login',
            success: function (data, textStatus) {
                console.log("data -> ", data)
                var response = JSON.parse(data)
                if (response.data.status) {

                    location.href = "/landingpage"

                } else {
                    alert("status : fail description : " + response.data.description)
                }
            },
            error: function (xhr, textStatus, errorThrown) {
                var response = JSON.parse(xhr.responseText);
                console.log("response -> ", response)
            }
        });
    });

