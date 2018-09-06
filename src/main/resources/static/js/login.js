$(function() {
	init();
});

function init() {
	
	$("#username").focus();

	$("#submitBtn").off("click").on("click", function() {

		var username = $("#username").val();
		var password = $("#password").val();
		if (username == "" || password == "") {
			alert("用户名或者密码为空");
			return false;
		} else {
			return true;
		}
	});
}