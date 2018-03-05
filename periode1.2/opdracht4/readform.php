<?php
$naam = $_POST['voornaam'];
$achternaam = $_POST['achternaam'];
$woonplaats = $_POST['woonplaats'];
$leeftijd = $_POST['leeftijd'];
echo 'Hallo ' . $naam . ' ' . $achternaam . " ik zie dat je " . $leeftijd . " jaar oud bent." . ".<br/>";
echo 'Je hebt ingevuld dat je in ' . $woonplaats . ' woont.<br/>';


if ($woonplaats == 'Amsterdam') {
    echo 'toevallig woon ik ook in Amsterdam';
} else {
    echo 'Jammer ik woon niet in ' . $woonplaats . '.';
}
