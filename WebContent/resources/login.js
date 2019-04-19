(function($) {
	$(function() {

		$("input[name='login']").off("click").on("click", function() {
			$.ajax({
				url:projectName+"/login.do?getQR",
				type:"post",
				cache:false,
				async:false,
				data:null,
				dataType:"json"
			}).done(function(result){
				alert(result);
			});
		});

	});
})(jQuery);