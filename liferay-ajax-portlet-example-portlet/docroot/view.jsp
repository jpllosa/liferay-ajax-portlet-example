<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />

Liferay AJAX Portlet Example

<form action="javascript:processName<portlet:namespace/>()">
	What is your name? 
	<input id="name" name="name" />
	<input type="submit" value="Submit" />
</form>
<p id="output"></p>

<portlet:resourceURL var="ajaxURL"></portlet:resourceURL>

<script type="text/javascript">

function processName<portlet:namespace/>() {
	$.ajax({
		url : "${ajaxURL}",
		data : {
			"name" : $("#name").val(),
		},

		type : "POST",
		dataType : "json",
		success : function(data) {
			var output = $("#output");
			output.text("");
			output.text("You alright, " + data.name + "?");
		},
		error : function() {
			console.log("Error processing name.");
		},
	});
}

</script>
