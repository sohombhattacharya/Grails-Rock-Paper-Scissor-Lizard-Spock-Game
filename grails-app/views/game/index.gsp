<html>
	<head>
	</head>
	<body>
	<h1>Rock, Paper, Scissor, Lizard, Spock!</h1>
	<g:form controller="Game" action="player1" params="[player:'player1']">
		<g:submitButton id="btn" name="loginButton" value="Player 1"/>
	</g:form>
	<g:form controller="Game" action="player2" params="[player:'player2']">
		<g:submitButton id="btn" name="loginButton" value="Player 2"/>
	</g:form>
	
	
	
	
	
	
	</body>
</html>