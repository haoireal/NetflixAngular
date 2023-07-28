<%@ page pageEncoding="UTF-8"%>
<!-- footer  -->
<div class="container footer">
	<div class="row">
		<div class="col-md-10 mx-auto">
			<div class="row">
				<div class="col-md-3">
					<ul>
						<li>Audio and Subtitle</li>
						<li>Media Center</li>
						<li>Privacy</li>
						<li>Contact Us</li>
					</ul>
				</div>
				<div class="col-md-3">
					<ul>
						<li>Audio description</li>
						<li>Investor Relation</li>
						<li>Terms and Conditions</li>
						<li>Legal Notices</li>
					</ul>
				</div>
				<div class="col-md-3">
					<ul>
						<li>Help Center</li>
						<li>Jobs</li>

					</ul>
				</div>
				<div class="col-md-3">
					<ul>
						<li>Gift card</li>
						<li>Subscription</li>

					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-10 mx-auto">
			<div class="row">

				<div class="col">
					<p class="copy-right">@netflix copyright</p>
				</div>
			</div>
		</div>
	</div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

<script>
	
	$(document).ready(function() {
		$(".bi-search").click(function() {
			$(".icon").toggleClass("active");
			$("input[type='text']").toggleClass("active");
		});

		
		$(".fa-google").click(function() {
			$(".icon").toggleClass("active");
			$("input[type='email']").toggleClass("active");
		});
	});
	
</script>
<script src="<c:url value ='/templates/user/js/javaScript.js'/>"></script>
