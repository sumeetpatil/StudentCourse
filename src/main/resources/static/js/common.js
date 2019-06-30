$(document).ready(function() {
	page.show("page_login");
	
//	page_login
//	page_registration

	$("#btnLogin").on("click", function() {
		var id = $("#inpStudentId").val();
		var password = $("#inpPassword").val();
		var data = remote.student.get(id);

		if (data == "error") {
			logger.error("Invalid Id or Credentials");
			return;
		}

		page.show("page_registration");

		var departmentData = remote.get(data._links.department.href);
		var semesterData = remote.get(data._links.semester.href);

		$("#department").html("Dept - "+departmentData.name +", Sem - "+semesterData.name);

		var coursesData = remote.get("http://localhost:8080/courses/search/findByDepartmentIdAndSemesterId?departmentId="+departmentData.id+"&semesterId="+semesterData.id);
		var elective = {};
		$("#page_registration_table").html("");
		coursesData._embedded.courses.forEach(function(data){
			if(data.elective!=null){
				if(!elective[data.elective.id]){
					elective[data.elective.id] = [];
				}
				elective[data.elective.id].push(data);
			}else{
				$("#page_registration_table").append("<tr><td>"+data.id+"</td><td>"+data.name+"</td><td>"+"NOT-ENROLLED"+"</td></tr>");
			}
		});


		var keys = Object.keys(elective);
		var electiveHtml;
		var electiveTitle;
		keys.forEach(function(i){
			var elect = elective[i];
			elect.forEach(function(elect){
				if(!electiveTitle){
					electiveTitle = elect.elective.name;
				}
				electiveHtml +="<option value='"+elect.id+"'>"+elect.name+"</option>";
			});
		});

		if(electiveHtml){
			if(electiveTitle){
				$("#electiveTitle").html(electiveTitle);
			}

			$("#elective").html("");
			$("#elective").append(electiveHtml);
		}
	});
});

var page = {
		show:function(id){
			$(".card-body").hide();
			$("#"+id).show();

			if ("undefined" != typeof history.pushState) {
				history.pushState({}, id, remote.getHost()+"home#"+id);
			}
		}
};

window.onhashchange = function () {
	var pageHash = window.location.hash;
	var pageHash = pageHash.replace("#","");
	page.show(pageHash);
}