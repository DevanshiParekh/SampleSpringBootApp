/**
 * 
 */
var GetRest = function() {
        $.ajax({
        type: 'GET',
        url:  "/sample/rest/displayHello",
        dataType: 'text',
        success: function(result) {
        	console.log(result);
        	document.getElementById("demo").innerHTML = result;
        },
        error: function(jqXHR, textStatus, errorThrown) {
            alert(jqXHR.status + ' ' + jqXHR.responseText);
        }
   });
}