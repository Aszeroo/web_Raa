$(document).ready(function (){
    setDatateble()
})

function setDatateble(url){
    dataTrasactionTable = $('#tableanswer').on( 'error.dt', function ( e, settings, techNote, message ) {
        console.error( 'An error has been reported by DataTables: ', message );
    } ).DataTable({
        dom: '<"d-flex justify-content-between align-items-center mx-0 row"<"col-sm-12 col-md-6"l><"col-sm-12 col-md-6"f>>t<"d-flex justify-content-between mx-0 row"<"col-sm-12 col-md-6"i><"col-sm-12 col-md-6"p>>',
        'order':[6,'desc'],
        'serverSide': true,
        'processing': true,
        'destroy': true,
        'scrollX': true,
        'pageLength': 10,
        'ajax': {
            'contentType': 'application/json',
            'url': url,
            'type': 'POST',
            'data': function (d) {
                return JSON.stringify(d);
            }
        },
        "columns": [
            {data: 'reqNo', "className": "text-left"},
            // {data: 'tranId', "className": "text-left"},
            // {data: 'attr6', "className": "text-center"},
            {data: 'functional', "className": "text-center"},
            {data: 'attr2', "className": "text-center"},
            {data: 'attr3', "className": "text-center"},
            {data: 'status', "className": "text-center"},
            {data: 'description', "className": "tex-left"},
            {
                data: 'createdAt',"className": "text-center", render: function (data) {
                    return moment(data).format('DD/MM/YYYY HH:mm:ss');
                }
            }
        ],
        language: {
            paginate: {
                // remove previous & next text from pagination
                previous: '&nbsp;',
                next: '&nbsp;'
            }
        }
    });
}