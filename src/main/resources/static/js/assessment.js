// var ans = [];
var Ans = {};
var Save = {};
var defaultObject = {
    'choice_id' : '',
    'test_id' : '',
    'question_id' : '',
    'answer' : '',
    'answer_status' : '',
    'answer_description' : '',
    'comment' : '',
    'create_by' : '',
}
var requestSave = [];

function getAllAns() {
    Ans = {
        'q01': $('input[name="answerYesOrNo1"]:checked').val(),
        'q02': $('input[name="answerYesOrNo2"]:checked').val(),
        'q03': $('input[name="answerYesOrNo3"]:checked').val(),
        'q04': $('input[name="answerYesOrNo4"]:checked').val(),
        'q05': $('input[name="answerYesOrNo5"]:checked').val(),
        'q06': $('input[name="answerYesOrNo6"]:checked').val(),
        'q07': $('input[name="answerYesOrNo7"]:checked').val(),
        'q08': $('input[name="answerYesOrNo8"]:checked').val(),
        'q09': $('input[name="answerYesOrNo9"]:checked').val(),
        'q10': $('input[name="answerYesOrNo10"]:checked').val(),
        'q11': $('input[name="answerYesOrNo11"]:checked').val(),
        'q12': $('input[name="answerYesOrNo12"]:checked').val(),
        'q13': $('input[name="answerYesOrNo13"]:checked').val(),
        'q14': $('input[name="answerYesOrNo14"]:checked').val(),
        'q15': $('input[name="answerYesOrNo15"]:checked').val(),
        'q16': $('input[name="answerYesOrNo16"]:checked').val(),
        'q17': $('input[name="answerYesOrNo17"]:checked').val(),
        'q18': $('input[name="answerYesOrNo18"]:checked').val(),
        'q19': $('input[name="answerYesOrNo19"]:checked').val(),
        'q20': $('input[name="answerYesOrNo20"]:checked').val(),
        'q21': $('input[name="answerYesOrNo21"]:checked').val(),
        'q22': $('input[name="answerYesOrNo22"]:checked').val(),
        'q23': $('input[name="answerYesOrNo23"]:checked').val(),
        'q24': $('input[name="answerYesOrNo24"]:checked').val(),
        'q25': $('input[name="answerYesOrNo25"]:checked').val(),
        'q26': $('input[name="answerYesOrNo26"]:checked').val(),
        'q27': $('input[name="answerYesOrNo27"]:checked').val(),
        'q28': $('input[name="answerYesOrNo28"]:checked').val(),
        'q29': $('input[name="answerYesOrNo29"]:checked').val(),
        'q30': $('input[name="answerYesOrNo30"]:checked').val(),
        'q31': $('input[name="answerYesOrNo31"]:checked').val(),
        'q32': $('input[name="answerYesOrNo32"]:checked').val(),
        'q33': $('input[name="answerYesOrNo33"]:checked').val(),
        'q34': $('input[name="answerYesOrNo34"]:checked').val(),
        'q35': $('input[name="answerYesOrNo35"]:checked').val(),
        'q36': $('input[name="answerYesOrNo36"]:checked').val(),
        'q37': $('input[name="answerYesOrNo37"]:checked').val(),
        'q38': $('input[name="answerYesOrNo38"]:checked').val(),
        'q39': $('input[name="answerYesOrNo39"]:checked').val(),
        'q40': $('input[name="answerYesOrNo40"]:checked').val(),
        'q41': $('input[name="answerYesOrNo41"]:checked').val(),
        'q42': $('input[name="answerYesOrNo42"]:checked').val(),
        'q43': $('input[name="answerYesOrNo43"]:checked').val(),
        'q44': $('input[name="answerYesOrNo44"]:checked').val(),
        'q45': $('input[name="answerYesOrNo45"]:checked').val(),
        'q46': $('input[name="answerYesOrNo46"]:checked').val(),
        'q47': $('input[name="answerYesOrNo47"]:checked').val(),
        'q48': $('input[name="answerYesOrNo48"]:checked').val()
    };
    var count = Object.keys(Ans).length;
    console.log(count);
    for (var i = 1; i <= count; i++) {
        if ($('input[name="answerYesOrNo' + i + '"]:checked').val() === undefined) {
            document.getElementById('answerall').disabled = true;
            // alert("กรุณากลับไปทำข้อที่"+i);
            // break;
        } else {
            document.getElementById('answerall').disabled = false;
        }
    }

}

function saveanswer() {

    for (var i = 1; i < 49; i++) {
        defaultObject.answer = $('input[name="answerYesOrNo' + i + '"]:checked').val()
        defaultObject.question_id = i < 10 ? 'q0' + i : 'q' + i
        defaultObject.answer_status = 'active'
        defaultObject.create_by = username
        requestSave.push(defaultObject)
        defaultObject = {
            'choice_id' : '',
            'test_id' : '',
            'question_id' : '',
            'answer' : '',
            'answer_status' : '',
            'answer_description' : '',
            'comment' : '',
            'create_by' : '',
        }
    }

    $.ajax({
        type: "POST",
        url: "/apis/answer/allanswer",
        data: JSON.stringify(requestSave),
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        success: function () {
            // window.location.href = "/Results"
        },
    });
}
