<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>BAP OPDRACHT 6</title>
</head>
<body>
<h1>BAP OPDRACHT 6</h1>
<h2>Klasgenoten:</h2>

<?php
    // DATABASE-VARIABELEN AANMAKEN (LET OP: VERANDER JE DATABASENAAM)
    $host = 'localhost';
    $user = 'root';
    $password = 'root';
    $database = '24571_db';

    // CONNECTIE MAKEN
    $dbc = mysqli_connect($host,$user,$password,$database) or die ('Er is geen connectie met de database. Check je databasevariabelen.');

    // QUERY (OPDRACHT) SCHRIJVEN
    $query = "SELECT * FROM klasgenoten";

    // QUERY UITVOEREN
    $result = mysqli_query($dbc, $query) or die ('De query is mislukt.');

    // MET EEN WHILE-LOOP ALLE GEGEVENS IN BEELD BRENGEN
    while ($row = mysqli_fetch_array($result)) {
        echo $row['klasgenoot_id'] . "\t" . $row['voornaam'] . "\t" . $row['tussenvoegsel'] . "\t" . $row['achternaam'] . "\t" . $row['woonplaats'] . "<br>\n";
    }

    // CONNECTIE SLUITEN
    $dbc_closed = mysqli_close($dbc);
?>

<p>Klik <a href="voegtoe.php">hier</a> om een klasgenoot toe te voegen!</p>

</body>
</html>