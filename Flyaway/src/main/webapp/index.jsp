<html>
<head>
<link rel="stylesheet" href="flyAway.css">
</head>
<body>
<h1 align=center>FlyAway</h1>
<h4>Book Your Flight Today</h4>
<form action="AirportsController" method="get">
  <label>Departure City</label>
  <input type="text" name="depart" required>
  <label>Arrival City</label>
  <input type="text" name="arrive" required>
  <label for="departureDate">Departure date:</label>
  <input type="date" id="departureDate" name="tripStart"
       value="2022-06-15"
       min="2022-06-15" max="2022-09-15">
  <label for="returnDate">Return date:</label>
  <input type="date" id="returnDate" name="tripEnd"
       value="2022-06-15"
       min="2022-06-15" max="2022-09-15"><br/>
  <label>Number Of Travelers</label>
  <input type="number" name="travelers" value=1>
  <input type="submit" name="Submit">
  <input type="reset" value="Reset">
</form>
</body>
</html>