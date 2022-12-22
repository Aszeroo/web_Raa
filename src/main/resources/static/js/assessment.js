// var ans = [];
var Ans = {};

function getAllAns() {
    Ans = {
        'Options1' : $('input[name="answerYesOrNo1"]:checked').val(),
        'Options2' : $('input[name="answerYesOrNo2"]:checked').val(),
        'Options3' : $('input[name="answerYesOrNo3"]:checked').val(),
        'Options4' : $('input[name="answerYesOrNo4"]:checked').val(),
        'Options5' : $('input[name="answerYesOrNo5"]:checked').val(),
        'Options6' : $('input[name="answerYesOrNo6"]:checked').val(),
        'Options7' : $('input[name="answerYesOrNo7"]:checked').val(),
        'Options8' : $('input[name="answerYesOrNo8"]:checked').val(),
        'Options9' : $('input[name="answerYesOrNo9"]:checked').val(),
        'Options10' : $('input[name="answerYesOrNo10"]:checked').val(),
        'Options11' : $('input[name="answerYesOrNo11"]:checked').val(),
        'Options12' : $('input[name="answerYesOrNo12"]:checked').val(),
        'Options13' : $('input[name="answerYesOrNo13"]:checked').val(),
        'Options14' : $('input[name="answerYesOrNo14"]:checked').val(),
        'Options15' : $('input[name="answerYesOrNo15"]:checked').val(),
        'Options16' : $('input[name="answerYesOrNo16"]:checked').val(),
        'Options17' : $('input[name="answerYesOrNo17"]:checked').val(),
        'Options18' : $('input[name="answerYesOrNo18"]:checked').val(),
        'Options19' : $('input[name="answerYesOrNo19"]:checked').val(),
        'Options20' : $('input[name="answerYesOrNo20"]:checked').val(),
        'Options21' : $('input[name="answerYesOrNo21"]:checked').val(),
        'Options22' : $('input[name="answerYesOrNo22"]:checked').val(),
        'Options23' : $('input[name="answerYesOrNo23"]:checked').val(),
        'Options24' : $('input[name="answerYesOrNo24"]:checked').val(),
        'Options25' : $('input[name="answerYesOrNo25"]:checked').val(),
        'Options26' : $('input[name="answerYesOrNo26"]:checked').val(),
        'Options27' : $('input[name="answerYesOrNo27"]:checked').val(),
        'Options28' : $('input[name="answerYesOrNo28"]:checked').val(),
        'Options29' : $('input[name="answerYesOrNo29"]:checked').val(),
        'Options30' : $('input[name="answerYesOrNo30"]:checked').val(),
        'Options31' : $('input[name="answerYesOrNo31"]:checked').val(),
        'Options32' : $('input[name="answerYesOrNo32"]:checked').val(),
        'Options33' : $('input[name="answerYesOrNo33"]:checked').val(),
        'Options34' : $('input[name="answerYesOrNo34"]:checked').val(),
        'Options35' : $('input[name="answerYesOrNo35"]:checked').val(),
        'Options36' : $('input[name="answerYesOrNo36"]:checked').val(),
        'Options37' : $('input[name="answerYesOrNo37"]:checked').val(),
        'Options38' : $('input[name="answerYesOrNo38"]:checked').val(),
        'Options39' : $('input[name="answerYesOrNo39"]:checked').val(),
        'Options40' : $('input[name="answerYesOrNo40"]:checked').val(),
        'Options41' : $('input[name="answerYesOrNo41"]:checked').val(),
        'Options42' : $('input[name="answerYesOrNo42"]:checked').val(),
        'Options43' : $('input[name="answerYesOrNo43"]:checked').val(),
        'Options44' : $('input[name="answerYesOrNo44"]:checked').val(),
        'Options45' : $('input[name="answerYesOrNo45"]:checked').val(),
        'Options46' : $('input[name="answerYesOrNo46"]:checked').val(),
        'Options47' : $('input[name="answerYesOrNo47"]:checked').val(),
        'Options48' : $('input[name="answerYesOrNo48"]:checked').val()
    };

var count = Object.keys(Ans).length;
    console.log(count);
for (var i = 1; i <= count; i++) {
    if($('input[name="answerYesOrNo'+i+'"]:checked').val()===undefined){
        document.getElementById('answerall').disabled = true;
        // alert("กรุณากลับไปทำข้อที่"+i);
        // break;
    }
    else
    {
        document.getElementById('answerall').disabled = false;
    }
}
}