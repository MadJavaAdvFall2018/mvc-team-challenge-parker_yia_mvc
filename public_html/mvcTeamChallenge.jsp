<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta name="generator" content="HTML Tidy, see www.w3.org" />
        <title>Lab 3-4: MVC Demo</title>
    </head>

    <body>
    <form name="matchingForm" action="/java112/mvc-teamChallenge">
        <table>
            <tr>
                <td><input type="radio" name="color1" value="green">Green</td>
                <td><input type="radio" name="color1" value="blue">Blue</td>
                <td><input type="radio" name="color1" value="red">Red</td>
            </tr>
            <tr>
                <td><input type="radio" name="color2" value="red">Red</td>
                <td><input type="radio" name="color2" value="blue">Blue</td>
                <td><input type="radio" name="color2" value="green">Green</td>
            </tr>
            <tr><td>${colorCompare.compare}</td></tr>
            <input type="submit" value="submit">
        </table>
    </form>
    </body>
</html>
