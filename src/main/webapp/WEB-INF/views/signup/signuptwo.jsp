<%@ include file="/WEB-INF/views/includes/includes.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>IFICAMPUS - Register</title>

  <!-- Custom fonts for this template-->
  <link href="<%=request.getContextPath() %>/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="<%=request.getContextPath() %>/resources/css/sb-admin-2.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

  <div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">
        <!-- Nested Row within Card Body -->
        <div class="row">
          <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
          <div class="col-lg-7">
            <div class="p-5">
              <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">Veuillez completer le formulaire!</h1>
              </div>
              
              <c:url value="/signup/enregistrer" var ="urlEnregistrer" />
			  <f:form modelAttribute="candidat" action="${urlEnregistrer }" role = "form">
              <!-- <form class="user"> -->
              	<f:input path="personne_id" hidden="true" value="${personne.personne_id }"/>
              	<f:input path="nom" hidden="true" value="${personne.nom }"/>
              	<f:input path="prenom" hidden="true" value="${personne.prenom }"/>
                <f:input path="password" hidden="true" value="${personne.password }"/>
              	<f:input path="mail" hidden="true" value="${personne.mail }"/>
              	<f:input path="actived" hidden="true" value="1"/>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                  	<f:select class="form-control" path="canditat_pays.pays_id" items="${listPays }"   itemLabel="pays_name" itemValue="pays_id" required="required"/>
                  </div>
                  <div class="col-sm-6">
                    <f:input path="passeport" type="text" class="form-control form-control-user" id="passeportnumber" placeholder="Passeport Number" required="required"/>                  
                  </div>
                </div>
                <div class="form-group row">
                	<div class="col-sm-3 mb-3 mb-sm-0">
                		<input type="text" class="form-control form-control-user" id="phonecode" placeholder="Code"/>
                	</div>
                	<div class="col-sm-9">
                		<f:input path="num" type="number" class="form-control form-control-user" id="phonenumber" placeholder="Phone Number" required="required"/>                  
                	</div>
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <f:input type="date"  path="nais"  class="form-control form-control-user" id="birthday" placeholder="Birthday"/>
                  </div>
                  <div class="col-sm-6">
                    <f:select path="sex" class="form-control">
                    	<option value="0">Sexe</option>
                        <option value="1">Masculin</option>
                        <option value="2">Féminin</option>
                     </f:select>
                  </div>
                </div>
                <input type="submit"  class="btn btn-primary btn-user btn-block" value="Enregistrer" />
              </f:form>
            
              <hr>
              <div class="text-center">
                <a class="small" href="<c:url value="/" />" >Already have an account? Login!</a>
              </div>
            </div>
          </div>
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

</body>

</html>
