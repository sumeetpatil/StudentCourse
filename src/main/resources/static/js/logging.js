$("#success").hide();
$("#error").hide();

var logger = {
		success : function(msg) {
			$("#success").html(msg);
			$("#success").fadeIn(1000);
			$("#success").fadeOut(3000);
		},
		error : function(msg) {
			$("#error").html(msg);
			$("#error").fadeIn(1000);
			$("#error").fadeOut(3000);
		}
};