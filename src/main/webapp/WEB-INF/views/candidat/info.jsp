<%@ include file="/WEB-INF/views/includes/includes.jsp" %>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- End of Sidebar -->
 	    <%@ include file="/WEB-INF/views/menu_left/menuLeft.jsp" %>
    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">
      <div id="content">
        <!-- End of Topbar -->
           <%@ include file="/WEB-INF/views/menu_top/menuTop.jsp" %>
        <!-- Begin Page Content -->
        <div class="container-fluid">
			<div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Informations personnelles</h1>
                       
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
        <!-- /.container-fluid -->
		<div class="row">
			
			<div class="col-xl-12 col-lg-12">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">Vos infos</h6>
                </div>
                <!-- Card Body -->
                <div class="card-body">
                    <div class="row">
	                                <div class="col-lg-6">
	                                    <form role="form">
	                                        <div class="form-group">
	                                             <label for="disabledSelect">Nom</label>
	                                             <input class="form-control" id="disabledName" type="text" placeholder="Votre nom"  disabled="" value="${candidat.getNom() }">
	                                        </div>
	                                        <div class="form-group">
	                                            <label>Prenom</label>
	                                             <input class="form-control" id="disabledPrenom" type="text" placeholder="Votre prenom"  disabled="" value="${candidat.getPrenom() }">
	                                        </div>
	                                        <div class="form-group">
	                                            <label>Date de Naissance</label>
	                                             <input class="form-control" id="disabledNais" type="text" placeholder="Votre Date de naissance"  disabled="" value="${candidat.getNais() }">
	                                        </div>
	                                        <%-- <div class="form-group">
	                                            <label>Numéro de téléphone</label>
	                                             <input class="form-control" id="disabledPhone" type="text" placeholder="Votre Numéro de téléphone"  disabled="" value="${candidat.getNum() }">
	                                        </div> --%>
	                                        
	                                        <%-- <div class="form-group row">
							                	<div class="col-sm-3 mb-3 mb-sm-0">
							                		<input type="text" class="form-control form-control-user" id="phonecode" placeholder="Code"/>
							                	</div>
							                	<div class="col-sm-9">
							                		<f:input path="num" type="number" class="form-control form-control-user" id="phonenumber" placeholder="Phone Number" required="required"/>                  
							                	</div>
							                </div> --%>
	                                        
	                                        <label>Numéro de téléphone</label>
	                                        <div class="form-group row">
	                                        	
							                	<div class="col-sm-3 mb-3 mb-sm-0">
							                		<input type="text" class="form-control" id="phonecode" placeholder="Code" disabled="" value="${candidat.getCanditat_pays().getPays_code()}" />
							                	</div>
							                	<div class="col-sm-9">
	                                             	<input class="form-control" id="disabledPhone" type="text" placeholder="Votre Numéro de téléphone"  disabled="" value="${candidat.getNum() }">
							                	</div>
							                </div>
	                                    </form>
	                                </div>
	                                <!-- /.col-lg-6 (nested) -->
	                                <div class="col-lg-6">  
	                                    <form role="form">
	                                        <fieldset >
	                                            <div class="form-group">
	                                                <label for="disabledSelect">Pays</label>
	                                                 <select id="disabledSelect" class="form-control" disabled>
	                                                    <option>${candidat.getCanditat_pays().getPays_name()}</option>
	                                                </select>
	                                            </div>
	                                            <div class="form-group">
	                                                <label for="disabledSelect">Numéro de passeport</label>
	                                                <input class="form-control" id="disabledMail" type="text" placeholder="Email"  disabled value="${candidat.getPasseport() }">
	                                                
	                                            </div>
	                                            <div class="form-group">
	                                                <label for="disabledSelect">Adresse email</label>
	                                                <input class="form-control" id="disabledPrenom" type="text" placeholder="Numéro de passeport"  disabled="" value="${candidat.getMail() }">
	                                                
	                                            </div>
	                                            <div class="form-group">
	                                                <label for="disabledSelect">Sexe</label>
	                                                <input class="form-control" id="disabledSexe" type="text" placeholder="Genre"  disabled="" value="${candidat.getSex() }">
	                                            </div>
	                                            <button type="button" class="btn btn-danger" disabled>Annuler</button>
	                                        	<button type="submit" class="btn btn-success" disabled>Enregistrer</button>
	                                            <button type="button" class="btn btn-primary">Modifier</button>
	                                        </fieldset>
	                                    </form>
	                                </div>
	                                <!-- /.col-lg-6 (nested) -->
	                            </div>
                  
                </div>
              </div>
            </div>
		</div>
      </div>
      <!-- End of Main Content -->

      <!-- Footer -->
      <footer class="sticky-footer bg-white">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>Copyright &copy; Your Website 2019</span>
          </div>
        </div>
      </footer>
      <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Selectionnez "Logout" pour vous déconnecter.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <c:url value="/j_spring_security_logout" var="logout"/>
          <a class="btn btn-primary" href="${logout }">Logout</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
 
  <script src="<%=request.getContextPath() %>/resources/vendor/jquery/jquery.min.js"></script>
  <script src="<%=request.getContextPath() %>/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="<%=request.getContextPath() %>/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="<%=request.getContextPath() %>/resources/js/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="<%=request.getContextPath() %>/resources/vendor/chart.js/Chart.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="<%=request.getContextPath() %>/resources/js/demo/chart-area-demo.js"></script>
  <script src="<%=request.getContextPath() %>/resources/js/demo/chart-pie-demo.js"></script>

</body>

</html>
