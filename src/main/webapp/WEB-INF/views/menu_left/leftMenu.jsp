    <%@ include file="/WEB-INF/views/includes/includes.jsp" %>
   <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">


      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="#">
        <div class="sidebar-brand-icon rotate-n-15" style="background:white">
          <i class="fas"><img alt="" src="<%=request.getContextPath() %>/resources/img/ifilogo.png"></i>
        </div>
        <div class="sidebar-brand-text mx-3">IFICAMPUS </div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item active">
      <c:url value="/candidat/" var="dashboard"/>
        <a class="nav-link" href="${dashboard }">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Dashboard</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
      <c:url value="/candidat/info" var="info"/>
        <a class="nav-link collapsed" href="${info }"  >
          <i class="fas fa-fw fa-user"></i>
          <span>Informations Personnelles</span>
        </a>
      </li>

       <li class="nav-item">
      	<c:url value="/staff/listcandidat" var="dossier_candidat"/>
        <a class="nav-link collapsed" href="${dossier_candidat }" >
          <i class="fas fa-fw fa-table"></i>
          <span>Gerer les candidats</span>
        </a>
      </li> 

      <!-- Nav Item - Utilities Collapse Menu -->
      <li class="nav-item">
      	<c:url value="/candidat/formation" var="formation"/>
        <a class="nav-link collapsed" href="${formation }" >
          <i class="fas fa-fw fa-users"></i>
          <span>Gerer les utilisateurs</span>
        </a>
      </li>
    

      <!-- Nav Item - Pages Collapse Menu -->
      <!-- Nav Item - Charts -->
      

      <!-- Nav Item - Tables -->
      

      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>