<?php
//FOrmulier uitlezen
$mailadres = $_POST['mailadres'];
//CONNECTIE MAKEN
$host = 'localhost';
$username = 'root';
$password = 'root';
$dbname = '24571_db';

$dbc = mysqli_connect($host, $username, $password, $dbname) or die ('error');
//QUERY BEDENKEN VOOR ZOEKEN DATA
$query = "SELECT * FROM opdracht7 WHERE mailadres = '$mailadres'";
//QUERY UITVOEREN
$result = mysqli_query($dbc, $query) or die ('error query (UITVOEREN)');
//TELLEN HOEEVL REGELS WE NU HEBBEN
$number_of_rows = mysqli_num_rows($result);
//TESTEN OF ER MAILS ZIJN
if ($number_of_rows == 0)
{
    echo 'Het mailadres' . $mailadres . 'is niet gevonden in het database.<br>';
    echo '<a href="uitschrijven.php">Klik om het nogmaals te proberen</a><br>';
    exit();
}
//QUERY ZOEKEN VOOR VERWIJDEREN ZOEKEN
$query = "DELETE FROM opdracht7 WHERE mailadres = '$mailadres'";
//QUERY UITVOEREN
$result = mysqli_query($dbc, $query) or die ('error query (VERWIJDEREN)');
//CONNECTIE VERBREKEN
mysqli_close($dbc);
//VERSLAG DOEN VAN HET RESULTAAT
echo 'Het mailadres' . $mailadres . ' is met succes uitgeschreven van de nieuwsbrief.<br>';
?>

<a href="index.php">Klik hier om terug te gaan naar de home page</a><br>

