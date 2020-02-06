<%@ include file="/WEB-INF/views/includes/includes.jsp" %>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- End of Sidebar -->
 	    <%@ include file="/WEB-INF/views/menu_left/menuLeft.jsp" %>
    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- End of Topbar -->
           <%@ include file="/WEB-INF/views/menu_top/menuTop.jsp" %>
        <!-- Begin Page Content -->
        <div class="container-fluid">

			<div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Tableau de bord</h1>
                     	
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
          
           <div class="row">

            <!-- Earnings (Monthly) Card Example -->
            <!-- Earnings (Monthly) Card Example -->
            <!-- Earnings (Monthly) Card Example -->
            <!-- Pending Requests Card Example -->
            <div class="col-xl-3 col-md-6 mb-4 card bg-info text-white shadow">
               <div class="card-body">
                 Etat du dossier
                 <div class="text-white-50 small">Votre dossier est ${dossier.getDossier_etat().getIntitule().toLowerCase() }</div>
               </div>
            </div>
            
            
            
          </div>
        <!-- /.container-fluid -->
		<div class="row">
			
			<div class="col-xl-12 col-lg-12">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">Vos documents</h6>
                </div>
                <!-- Card Body -->
                <div class="card-body">
                  
                 <div class="col-lg-12">
                    <div class="panel panel-default">
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                            <form method="post" action="doUpload" enctype="multipart/form-data">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>Documents</th>
                                            <th>#</th>
                                        </tr>
                                    </thead>
                                    	 <tbody>
	                                        <tr>
	                                            <td>Diplôme</td>
	                                            <td><div class="form-group">
	                                            <input type="file" name="fileUpload">
	                                        </div></td>
	                                        </tr>
	                                        <tr>
	                                            <td>Passeport</td>
	                                            <td><div class="form-group">
	                                            <input type="file" name="fileUpload">
	                                        </div></td>
	                                        </tr>
	                                        <tr>
	                                            <td>Lettre de recommandation</td>
	                                            <td><div class="form-group">
	                                            <input type="file" name="fileUpload">
	                                        </div></td>
	                                        </tr>
	                                        <tr>
	                                            <td>Relevé bancaire</td>
	                                            <td><div class="form-group">
	                                            <input type="file" name="fileUpload">
	                                        </div></td>
	                                        </tr>
	                                        <tr>
	                                            <td>Lettre de caution</td>
	                                            <td><div class="form-group">
	                                            <input type="file" name="fileUpload">
	                                            </div></td>
	                                        </tr> 
	                                        <tr>
	                                        	<td></td>
	                                        	<td><button type="submit" class="btn btn-primary">Valider</button></td>
	                                        </tr>
	                                         
	                                    </tbody>
                                </table>
                                </form>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
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
