var remote = {
	get : function(href) {
		href = href.replace("http://localhost:8080/", remote.getHost());
		var retData = "";
		$.ajax({
			url : href,
			method : "GET",
			async : false,
			success : function(data) {
				retData = data;
			},
			error : function(data) {
				console.log("error:" + data);
				retData = "error";
			}
		});

		return retData;
	},
	student : {
		get : function(id) {
			var url = remote.getHost() + "students/" + id;
			return remote.get(url);
		}
	},
	getHost : function() {
		return "http://localhost:8080/";
	}
};