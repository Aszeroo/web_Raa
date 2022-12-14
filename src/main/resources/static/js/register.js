function inputdata() {
    var fname = document.getElementById("fname").value;
    document.getElementById("demo").innerHTML = fname;
}
const input = document.getElementById('field');
input.setAttribute('required', '');
input.removeAttribute('required');

