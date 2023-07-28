<%@ page pageEncoding="UTF-8"%>
<!-- header -->
<nav
	class="navbar bg-dark">
	<div class="container-fluid">
		<div class="netflix-row">
			<div class="left d-flex align-items-center">
				<a class="navbar-brand" href="/PhamGiaHaoASM/netflix/index"> <img
					src="<c:url value ='/templates/user/img/logo.png'/>" alt="">
				</a>
				<div class="netflix-nav">
					<section>
						<button>Video</button>
						<button>Users</button>
						<button>Favorite</button>
						<button>Share</button>
					</section>
				</div>
				<div class="netflix-dropdown-box dropdown">
					<button class="netflix-dropdown dropdown-toggle" type="button"
						id="dropdownMenuButton1" data-bs-toggle="dropdown"
						aria-expanded="false">Browse</button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
						<li><a class="dropdown-item" href="#">Home</a></li>
						<li><a class="dropdown-item" href="#">TV Shows</a></li>
						<li><a class="dropdown-item" href="#">Movies</a></li>
						<li><a class="dropdown-item" href="#">News & Popular</a></li>
						<li><a class="dropdown-item" href="#">My List</a></li>
					</ul>
				</div>
			</div>
			<div class="right d-flex align-items-center">
				<div class="dropdown">
					<section class="netflix-profile w-100 pl-3" id="dropdownMenuButton"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"
						style="background-color: rgb(249, 14, 14, 0.800);">
						<p class="mt-1 pt-1">
							<b>Wellcome, ${sessionScope.currentUser.toString()}</b>
						</p>
					</section>
					
					<div class="dropdown-menu bg-dark"
						aria-labelledby="dropdownMenuButton">
						<a class="dropdown-item" href="/PhamGiaHaoASM/netflix/index"><b>User mode</b> </a> <a
							class="dropdown-item" href="/PhamGiaHaoASM/netflix/logout"><b>Log
								out</b> </a>
					</div>
				</div>
			</div>
		</div>
	</div>
</nav>
<!-- /header -->