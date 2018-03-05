<?php
$woonplaats = $_POST['woonplaats'];
echo $woonplaats;

$hobby = $_POST['hobby'];

if ($hobby == 'voetbal') {
    echo 'oh, ik hou ook van voetbal.';
} else {
    echo 'oh zelf heb ik een hekel aan ' . $hobby;
}