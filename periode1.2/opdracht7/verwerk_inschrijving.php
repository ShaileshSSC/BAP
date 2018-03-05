<?php
$voornaam = $_POST['voornaam'];
$tussenvoegsel = $_POST['tussenvoegsel'];
$achternaam = $_POST['achternaam'];
$mailadres = $_POST['mailadres'];

//DATA IN DATABSE STOPPEN
$dbc = mysqli_connect('localhost', 'root', 'root', '24571_db') or die ('Error connecting');

$query = "INSERT INTO opdracht7 VALUES(0, '$voornaam', '$tussenvoegsel', '$achternaam', '$mailadres')";

$result = mysqli_query($dbc, $query) or die ('error querrying');

mysqli_close($dbc);

if($result){
    echo "De volgende gegevens zijn toegevoegd aan het database ";
    echo $voornaam;
    echo  $tussenvoegsel;
    echo $achternaam;
    echo $mailadres;
} else {
    echo "sorry er is iets misgegaan";
}