<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="saveStudent">
        <label for="">Student Id:</label>
        <input type="text" name="sid" id="" placeholder="sid"><br>
                <label for="">Student Name:</label>
        <input type="text" name="sname" id="" placeholder="sname"><br>
                <label for="">Email:</label>
        <input type="text" name="email" id="" placeholder="email"><br>
                <label for="">Phno:</label>
        <input type="text" name="phno" id="" placeholder="phno"><br>
        <input type="submit" name="submit" id="" placeholder="submit">

    </form>

    <h1>Please Enter Student Id For Details</h1>
    <form action="detailsById">
        <input type="text" name="sid" id="" placeholder="Student Id">
        <input type="submit" name="" id="" placeholder="submit">
    </form>

    <h1>Please Enter Student Id To Delete</h1>
    <form action="deleteById">
        <input type="text" name="sid" id="" placeholder="Student Id">
        <input type="submit" name="" id="" placeholder="submit">
    </form>
</body>
</html>