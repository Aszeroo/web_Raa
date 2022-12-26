// var ans = [];
var Ans = {};
var Save = {};
var requestSave = [];
groups = {};
var all_input = document.querySelectorAll('input[type="radio"]');
for (var i = 0; i < all_input.length; ++i) {
    if (!(all_input[i].name in groups)) {
        groups[all_input[i].name] = 0;
    } else {
        groups[all_input[i].name] += 1;
    }
}
var countAssessment = Object.keys(groups).length;

function getAllAns() {
    if (document.querySelectorAll('input[type=radio]:checked').length != countAssessment) {
        document.getElementById('answerall').disabled = true;
    } else {
        document.getElementById('answerall').disabled = false;
    }
}

function saveanswer() {
    for (var i = 1; i < countAssessment + 1; i++) {
        var defaultObject = {
            'choice_id' : '',
            'test_id' : '',
            'question_id' : i < 10 ? 'q0' + i : 'q' + i,
            'answer' : $('input[name="answerYesOrNo' + i + '"]:checked').val(),
            'answer_status' : 'active',
            'answer_description' : '',
            'comment' : '',
            'create_by' : username,
        }
        requestSave.push(defaultObject)
    }

    $.ajax({
        type: "POST",
        url: "/apis/answer/allanswer",
        data: JSON.stringify(requestSave),
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        success: function () {
            window.location.href = "/Results"
        },
        error: function (xhr, textStatus, errorThrown) {
            var response = JSON.parse(xhr.responseText);
            console.log("response -> ", response)
        }
    });
}
