<!DOCTYPE html>
<html lang="nl">
	 <head>
		<meta charset="utf-8">
		<meta name="description" content="scripting GD">
		<meta name="author" content="Ma">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="https://fonts.googleapis.com/css?family=Source+Code+Pro" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="style.css">
		<title>PHP String handler</title>
	</head>
	 <body>
		 <?php
		 if ( !empty($_GET)) {
				 $input1 =  $_GET['input1']; // input uit html
				 $input2 =  $_GET['input2']; // input uit html
			 }
			else{
				 $input1 = ""; //lege string
				 $input2 = ""; //lege string
			 }
			// "schrijf hier de benodigde code"
		  ?>
		<div class="wrapper">
			<form method="GET" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
				<fieldset>
				 <legend>Zet hier jouw naam + klas</legend>
				 <input id="emaill" type = "text" name = "input1"  placeholder = "string 1"><br>
				 <input type = "text" name = "input2"   placeholder = " string 2">
				 <input type = "submit"  id = "submit" name = "submit" value = "submit">
			 </fieldset>
			</form>
			<hr>
			<?php
            $email = $input1;
					$string3 = trim($input1) . trim($input2);
			?><ul>
					<li class="showSpaces">Ingevoerde string 1:  <?php  echo $input1;  ?> </li>
					<li class="showSpaces">Ingevoerde string 2:  <?php  echo $input2;  ?> </li>
					<li>String 1 getrimd trim():  <?php echo trim($input1);  ?> </li>
                <li>String 2 getrimd trim():  <?php echo trim($input2);  ?> </li>
                <li>String 3 is String 1 en 2: <?php echo $string3;  ?> </li>
                <li>De lengte van String 3 is: <?php echo strlen($string3); ?> characters</li>
                <li>Er zit een spatie op positie: <?php echo stripos($input1," "); ?></li>
                <li>Er zit een @ op positie: <?php echo stripos($input1,"@"); ?></li>
                <li>Er zit een "." op positie: <?php echo stripos($input1,"."); ?></li>
                <li>Vervang "PHP" door "NodeJs" <?php echo str_replace("NodeJs", "PHP", $input1 ); ?></li>
                <li>Van String3 maak eerste letter een hoofdletter: <?php echo ucfirst($string3); ?></li>
                <li>Alles hoofdletters: <?php echo strtoupper($string3); ?></li>
                <li>Kijken of er een geschikte mail is: <?php if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
                        echo("$email is een geldig email address");
                    } else {
                        echo("$email is geen geldig email address");
                    }
                    ?></li>
				</ul>
				<hr>
				<ol>
				<li>Opdracht:<br> Stringhandler. Maak de PHP code voor <a href="http://schw.hosts.ma-cloud.nl/stringhandler/stringhandler.php">Stringhander<a>
				<li>Hoe moet jij inleveren?: <br>
						1) Link naar de werkende code in jouw portfoliomap bij Ma-cloud<br>
						2) Link naar jouw code bij GITHUB</li>
				<li>Bonus opdracht: maak PHP code waarmee jij controleert of een input een geldig e-mail adres zou kunnen zijn. Met JS controleren is niet toegestaan.</li>
				<li>Bonus opdracht: na submitten form, schrijf de eerder ingevoerde strings terug met PHP in de formulier invoer velden</li>
				</ol>
			</div>
	 </body>
</html>
