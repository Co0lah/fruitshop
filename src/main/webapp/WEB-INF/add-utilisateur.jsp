<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous" />

<title>Inscrivez-vous</title>

</head>
<body>


	<header class="bg-warning">
		<h4 style="text-align: center">Fruitstore</h4>
	</header>

	<div class="container">

		<h1>S'inscrire</h1>


		<form method="post" action="inscription">

			<div class="form-group">
				<label for="nom">Nom</label>
				 <input	type="text" class="form-control" name="nom" required> 
			</div>
			
			<div class="form-group">
				<label for="nom">Prenom</label>
				 <input	type="text" class="form-control" name="prenom" required> 
			</div>
			
			<div class="form-group">
				<label for="nom">Prenom</label>
				 <input	type="text" class="form-control" name="dateNaissance" required>
				 <small> Format dd/MM/YYYY</small> 
			</div>
			
			<div class="form-group">
				<label for="nom">email</label>
				 <input	type="email" class="form-control" name="email" required> 
			</div>
			
			<div class="form-group">
				<label for="nom">Choisissez un mot de passe</label>
				 <input	type="password" class="form-control" name="password" required > 
			</div>
			
			<div class="form-group">
				<label for="nom">Téléphone</label>
				 <input	type="number" class="form-control" name="telephone" > 
			</div>
			
			<div class="form-group my-4">
				<h4>Adresse</h4>
				<label for="numeroRue">N°</label>
				 <input	type="number" class="form-control" name="numeroRue" required> 
				
				<label for="rue">Rue</label>
				 <input	type="text" class="form-control" name="rue" required> 
				 
				 <label for="codePostal">Code Postal</label>
				 <input	type="number" class="form-control" name="codePostal" required> 
				 	
				 
				 <label for="ville">Ville</label>
				 <input	type="text" class="form-control" name="ville" required> 	
		
			</div>
			
			
			<div class="form-group my-4">
			<h4>Carte de paiement</h4>
			
				<label for="nomProprietaire" >Nom du Proprietaire</label>
				 <input	type="text" class="form-control" name="nomProprietaire" > 
			
				<label for="prenomProprietaire">Prenom</label>
				 <input	type="text" class="form-control" name="prenomProprietaire" > 
				 
				 <label for="numeroCarte">N° de carte</label>
				 <input	type="number" class="form-control" name="numeroCarte" > 
				 
				 <label for="cryptogramme">Cryptogramme</label>
				 <input	type="number" class="form-control" name="cryptogramme" > 
				 
				 <div class="form-group">
				<label for="dateExpiration">Date s'expiration</label>
				 <input	type="number" class="form-control" name="dateExpiration" >
				 <small> Format MM/YY</small> 
				</div>
			</div>
			
			<button class="btn btn-primary" type="submit" >S'inscrire </button>
	



		</form>



	</div>

</body>
</html>